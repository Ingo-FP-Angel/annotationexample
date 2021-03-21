package de.theonebrack.annotationexample.annotations

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.reflect.MethodSignature
import org.springframework.stereotype.Component

@Aspect
@Component
class SpanAspect {

    @Around("@annotation(Span)")
    @Throws(Throwable::class)
    fun createSpan(joinPoint: ProceedingJoinPoint): Any? {
        val ms = joinPoint.signature as MethodSignature
        val method = ms.method
        val span = method.getAnnotation(Span::class.java)
        println("Starting span ${span.name}")

        val proceed = joinPoint.proceed()

        return proceed
    }

}
