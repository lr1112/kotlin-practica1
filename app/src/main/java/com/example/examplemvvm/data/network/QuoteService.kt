package com.example.examplemvvm.data.network

import com.example.examplemvvm.core.RetrofitHelper
import com.example.examplemvvm.data.model.QuoteModel
import com.example.examplemvvm.data.network.QuoteApiClient

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject


class QuoteService @Inject constructor(private val api: QuoteApiClient) {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getQuotes(): List<QuoteModel>{
        return withContext(Dispatchers.IO){
            val response = api.getAllQuotes()
            response.body() ?: emptyList()
        }

    }
}