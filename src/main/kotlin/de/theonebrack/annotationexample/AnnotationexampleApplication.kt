package de.theonebrack.annotationexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AnnotationexampleApplication

fun main(args: Array<String>) {
	runApplication<AnnotationexampleApplication>(*args)
}
