package de.theonebrack.annotationexample.annotations

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class Span(val name: String) {
}