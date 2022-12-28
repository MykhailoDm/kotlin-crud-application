package com.springboot.kotlin.crud.controller

import com.springboot.kotlin.crud.dto.Greeting
import com.springboot.kotlin.crud.service.GreetingService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/greeting")
class GreetingController(val greetingService: GreetingService) {

    @GetMapping
    fun getAllGreetings() = greetingService.getAllGreetings()

    @GetMapping("/{id}")
    fun getGreetingById(@PathVariable id: String) = greetingService.getGreetingById(id)

    @PostMapping
    fun createGreeting(@RequestBody greeting: Greeting) = greetingService.save(greeting)
}