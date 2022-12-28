package com.springboot.kotlin.crud.dto

import jakarta.persistence.*

@Entity
@Table(name = "GREETING")
class Greeting(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    var id: Long? = null,
    @Column(name = "message", nullable = false)
    var message: String
)