package cn.willian.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:willian.wyann@gmail.com">willian</a>
 * @datetime 2024-10-25 08:32:43
 */
@Aspect
@Component
public class HelloAspect {

	// 定义切点
	@Pointcut("execution(public * cn.willian.spring.bean.AopService.hello(..))")
	public void pointCut() {
	}

	// 前置通知
	@Before(value = "pointCut()")
	public void before(JoinPoint joinPoint) {
		System.out.println("前置通知增强 + " + joinPoint.getSignature().getName());
	}

	// 前置通知
	@After(value = "pointCut()")
	public void after(JoinPoint joinPoint) {
		System.out.println("后置通知增强 + " + joinPoint.getSignature().getName());
	}

	// 环绕通知
	@Around("pointCut()")
	public Object around(ProceedingJoinPoint p) {

		System.out.println("环绕通知-开始增强 around...");
		Object o = null;
		try {
			o = p.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("环绕通知-结束增强 around...");
		return o;
	}

}
