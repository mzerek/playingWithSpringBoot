package com.mzerek.mzerekAop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MzerekAspect {

    @Pointcut("@annotation(MzerekAnnotation)")
    public void mzerekPointcut() {

    }

    @Before("mzerekPointcut()")
    public void mzerekAllMetodCallAdvice() {
        System.out.println("In Mzerek aspcet");
    }
}
