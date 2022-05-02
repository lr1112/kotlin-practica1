package com.example.examplemvvm.data.Model.network

import com.example.examplemvvm.core.RetrofitHelper
import com.example.examplemvvm.data.Model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class QuoteService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getQuotes(): List<QuoteModel>{
        return withContext(Dispatchers.IO){
            val response = retrofit.create(QuoteApiClient::class.java).getAllQuotes()
            response.body() ?: emptyList()
        }

    }
}