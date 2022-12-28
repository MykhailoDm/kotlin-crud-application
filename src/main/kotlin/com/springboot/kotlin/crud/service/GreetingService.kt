package com.springboot.kotlin.crud.service

import com.springboot.kotlin.crud.dto.Greeting
import com.springboot.kotlin.crud.repository.GreetingRepository
import org.springframework.stereotype.Service

@Service
class GreetingService(val greetingRepository: GreetingRepository) {
    fun getAllGreetings(): List<Greeting> = greetingRepository.findAll().toList()

    fun getGreetingById(id: String) = greetingRepository.findById(id)

    fun save(greeting: Greeting) = greetingRepository.save(greeting)
}