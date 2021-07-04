package com.example.springautoscaling.repository

import com.example.springautoscaling.entity.User
import com.github.javafaker.Faker
import org.springframework.stereotype.Repository

@Repository
class UserRandomRepository : UserRepository {

    private val generatedListSize = 20

    fun generateList(): List<User> {
        return (0..generatedListSize).map {
            User(
                Faker.instance().name().firstName(),
                Faker.instance().name().lastName(),
                Faker.instance().address().fullAddress()
            )
        }.toList()
    }

    override fun listAll(): List<User> {
       return generateList()
    }
}