package com.example.examplemvvm.data.Model

import com.example.examplemvvm.data.Model.network.QuoteService
import javax.inject.Inject

class QuoteRepository @Inject constructor(private  val  api:QuoteService, private val quoteProvider: QuoteProvider) {


    suspend fun getAllQuotes():List<QuoteModel>{
       val response = api.getQuotes()
        quoteProvider.quotes = response
        return response
    }
}