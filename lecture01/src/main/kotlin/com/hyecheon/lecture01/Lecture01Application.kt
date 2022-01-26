package com.hyecheon.lecture01

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableBatchProcessing
@SpringBootApplication
class Lecture01Application

fun main(args: Array<String>) {
	runApplication<Lecture01Application>(*args)
}
