package de.theonebrack.annotationexample.annotations

import org.aspectj.lang.annotation.Aspect
import org.springframework.stereotype.Component
import org.aspectj.lang.ProceedingJoinPoint

import org.aspectj.lang.annotation.Around

@Aspect
@Component
class LogExecutionTimeAspect {

    @Around("@annotation(LogExecutionTime)")
    @Throws(Throwable::class)
    fun logExecutionTime(joinPoint: ProceedingJoinPoint): Any? {
        val start = System.currentTimeMillis()

        val proceed = joinPoint.proceed()

        val executionTime = System.currentTimeMillis() - start

        println(joinPoint.signature.toString() + " executed in " + executionTime + "ms")
        return proceed
    }
}
