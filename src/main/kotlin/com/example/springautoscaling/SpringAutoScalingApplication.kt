package com.example.springautoscaling

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringAutoScalingApplication

fun main(args: Array<String>) {
    runApplication<SpringAutoScalingApplication>(*args)
}
