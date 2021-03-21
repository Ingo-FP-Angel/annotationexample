package de.theonebrack.annotationexample.controller

import de.theonebrack.annotationexample.annotations.LogExecutionTime
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DefaultController {

    @GetMapping
    @LogExecutionTime
    fun get(): String {
        return "Hello World!"
    }
}
