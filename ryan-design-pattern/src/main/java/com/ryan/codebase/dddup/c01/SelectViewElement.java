package com.ryan.codebase.dddup.c01;

/**
 * @author ryan
 * @version Id: SelectViewElement, v 0.1 2024/2/23 10:52 ryan Exp $
 */
public class SelectViewElement implements ViewElement{

    private ViewElementResolver viewElementResolver;
    private ViewElementResolverFactory resolverFactory;

    public void setViewElementResolverFactory(ViewElementResolverFactory resolverFactory) {
        this.resolverFactory = resolverFactory;
    }

    public String Render(){
        return resolverFactory.create(this.getClass().getName()).resolve(this);
    }

}
