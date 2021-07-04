package com.example.springautoscaling.controller

import com.example.springautoscaling.entity.User
import com.example.springautoscaling.repository.UserRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController(val userRepository: UserRepository)  {

    @GetMapping
    fun latest(): ResponseEntity<List<User>> {
      return  ResponseEntity.ok(userRepository.listAll())
    }
}