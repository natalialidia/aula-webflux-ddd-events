package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DddEventosWebfluxApplication

fun main(args: Array<String>) {
	runApplication<DddEventosWebfluxApplication>(*args)
}
