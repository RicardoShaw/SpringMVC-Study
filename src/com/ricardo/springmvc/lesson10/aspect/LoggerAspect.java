/**   
  * @Title: LoggerAspect.java 
  * @Package com.ricardo.springmvc.lesson10.aspect 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月10日 下午10:38:24 
  * @version V1.0   
*/
package com.ricardo.springmvc.lesson10.aspect;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/** 
 * @ClassName: LoggerAspect 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月10日 下午10:38:24 
 *  
 */

@Aspect
public class LoggerAspect {
	private static Logger logger = Logger.getLogger(LoggerAspect.class);
	
    @Pointcut("execution(* com.ricardo.springmvc..*Controller.add*(..))")
    public void declearJoinPointExpression(){}
    
    @Before("declearJoinPointExpression()") //该标签声明次方法是一个前置通知：在目标方法开始之前执行
    public void beforMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        logger.info("this method "+methodName+" begin. param<"+ args+">");
        System.out.println("this method "+methodName+" begin. param<"+ args+">");
    }
    
    
    @After("declearJoinPointExpression()")
    public void afterMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        logger.info("this method "+methodName+" end.");
    }
    
    @AfterReturning(value="declearJoinPointExpression()",returning="result")
    public void afterReturnMethod(JoinPoint joinPoint,Object result){
        String methodName = joinPoint.getSignature().getName();
        logger.info("this method "+methodName+" end.result<"+result+">");
    }
    
    @AfterThrowing(value="declearJoinPointExpression()",throwing="ex")
    public void afterThrowingMethod(JoinPoint joinPoint,Exception ex){
        String methodName = joinPoint.getSignature().getName();
        logger.info("this method "+methodName+" end.ex message<"+ex+">");
    }
    /**
     * 环绕通知(需要携带类型为ProceedingJoinPoint类型的参数)
     * 环绕通知包含前置、后置、返回、异常通知；ProceedingJoinPoin 类型的参数可以决定是否执行目标方法
     * 且环绕通知必须有返回值，返回值即目标方法的返回值
     * @param joinPoint
     */
    @Around(value="declearJoinPointExpression()")
    public Object aroundMethod(ProceedingJoinPoint point){
        
        Object result = null;
        String methodName = point.getSignature().getName();
        try {
            //前置通知
            logger.info("The method "+ methodName+" start. param<"+ Arrays.asList(point.getArgs())+">");
            //执行目标方法
            result = point.proceed();
            //返回通知
            logger.info("The method "+ methodName+" end. result<"+ result+">");
        } catch (Throwable e) {
            //异常通知
            logger.info("this method "+methodName+" end.ex message<"+e+">");
            throw new RuntimeException(e);
        }
        //后置通知
        logger.info("The method "+ methodName+" end.");
        return result;
    }
    
}
