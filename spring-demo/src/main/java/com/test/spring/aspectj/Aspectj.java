package com.test.spring.aspectj;

import com.test.spring.annotation.Action;
import jdk.nashorn.internal.scripts.JO;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

//定义切面
@Aspect
@Component
public class Aspectj {

    //定义切点   (使用注解作为规则)
    @Pointcut("@annotation(com.test.spring.annotation.Action)")
    public void annotationPointCut(){}

    //第一个* 表示修饰符 返回值   第一个*和包名之间有一个空格 切记
    //第二个* 表示DemoAnnotaion的所有方法
    //.. 表示任意的参数形式
    @Pointcut("execution(* com.test.spring.service.DemoAnnotation.*(..))")
    public void executionPointCut(){}

    //拦截器 使用切点规则
    @Before("annotationPointCut()")
    public void before(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Action action =  method.getAnnotation(Action.class);

        System.out.print("拦截器的名字" + action.name());

    }

    @After("executionPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
       System.out.print("执行了方法：" + method.getName());
    }

    @AfterReturning(value = "executionPointCut()",returning = "result")
    public void afterReturn(JoinPoint joinPoint,Object result){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.print("执行了方法：" + method.getName() + ",方法返回值为：" + result);
    }

    @AfterThrowing(value = "execution(* com.test.spring.service.DemoAnnotation.test2(..))",throwing = "exceptor")
    public void afterThrowing(JoinPoint joinPoint,Exception exceptor){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.print("执行了方法：" + method.getName() + ",异常为：" + exceptor.getMessage());
    }

    @Around(value="execution(* com.test.spring.service.DemoAnnotation.test3(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();

        System.out.println("执行方法前" + methodName);
        Object result = joinPoint.proceed();

        System.out.println("执行方法后" + methodName);

        return result;
    }
}
