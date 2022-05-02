package com.example.examplemvvm.data.Model.network

import com.example.examplemvvm.data.Model.QuoteModel
import retrofit2.Response

import retrofit2.http.GET

interface QuoteApiClient {
    @GET("/.json")
    suspend fun getAllQuotes():Response<List<QuoteModel>>
}