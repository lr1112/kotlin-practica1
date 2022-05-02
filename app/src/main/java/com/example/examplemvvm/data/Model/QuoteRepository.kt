package com.example.examplemvvm.data.Model

import com.example.examplemvvm.data.Model.network.QuoteService

class QuoteRepository {
    private  val  api = QuoteService()

    suspend fun getAllQuotes():List<QuoteModel>{
       val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}