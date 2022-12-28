package com.springboot.kotlin.crud.repository

import com.springboot.kotlin.crud.dto.Greeting
import org.springframework.data.repository.CrudRepository

interface GreetingRepository : CrudRepository<Greeting, String>