package com.live.mobilproje.data.repository

import com.live.mobilproje.data.api.RetrofitBuilder

class MainRepository {
    suspend fun getUsers() = RetrofitBuilder.api.getUsers()
}