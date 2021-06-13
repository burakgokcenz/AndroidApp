package com.live.mobilproje.data.api

import com.live.mobilproje.data.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): Response<MutableList<User>>
}