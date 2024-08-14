package com.ryan.codebase.dddup.c01;

/**
 * @author ryan
 * @version Id: AbstractViewElementResolverFactory, v 0.1 2024/2/23 10:46 ryan Exp $
 */
public abstract class AbstractViewElementResolverFactory implements ViewElementResolverFactory {

    @Override
    public ViewElementResolver create(String viewElementClassName) {
        String className = generateResolverClassName(viewElementClassName);
        // 通过反射创建ViewElementResolver实例

        return null;
    }

    private String generateResolverClassName(String viewElementClassName) {
        return getPrefix() + viewElementClassName + "Resolver";
    }

    protected abstract String getPrefix();

}
