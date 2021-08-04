package com.ryan.codebase.common.utils.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * @author Ryan
 * @version Id: RepeatSubmitAspect, v 0.1 2021/8/4 下午5:56 ryan Exp $
 */
@Aspect
@Component
public class RepeatSubmitAspect {

    private static final Set<String> KEY = new ConcurrentSkipListSet<>();

    @Pointcut("@annotation(noRepeatSubmit)")
    public void pointCut(NoRepeatSubmit noRepeatSubmit) {
    }

    @Around("pointCut(noRepeatSubmit)")
    public Object duplicate(ProceedingJoinPoint pjp, NoRepeatSubmit noRepeatSubmit) throws Throwable {
        // 获取锁定时间
        long lockTime = noRepeatSubmit.lockTime();
        String sign = "";
        try {
            // 根据方法名、参数 生成sign
            sign = createSign(pjp);

            // 参数之前是否有提交，有则重复
            boolean success = KEY.add(sign);
            if (!success) {
                throw new Exception("不能重复提交");
            }
            // 执行原方法
            return pjp.proceed();
        } finally {
            // 注解锁定时间内不能重复提交
            Thread.sleep(lockTime);
            KEY.remove(sign);
        }
    }

    private String createSign(ProceedingJoinPoint pjp) throws NoSuchMethodException {
        MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
        Method currentMethod = pjp.getTarget().getClass().getMethod(methodSignature.getName(), methodSignature.getParameterTypes());
        StringBuilder sb = new StringBuilder(currentMethod.toString());
        Object[] args = pjp.getArgs();
        for (Object object : args) {
            if (null != object) {
                sb.append(object.getClass().toString());
                sb.append(object.toString());
            }
        }
        return sb.toString();
    }
}
