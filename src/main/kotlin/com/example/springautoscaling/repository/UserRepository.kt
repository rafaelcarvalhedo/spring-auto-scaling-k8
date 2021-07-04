package com.example.springautoscaling.repository

import com.example.springautoscaling.entity.User

interface UserRepository {
    fun listAll(): List<User>
}