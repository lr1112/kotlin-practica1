package com.example.examplemvvm.domain

import com.example.examplemvvm.data.Model.QuoteModel
import com.example.examplemvvm.data.Model.QuoteRepository

class GetQuoteUseCase {
    private val repository = QuoteRepository()

    suspend operator fun invoke():List<QuoteModel>? =  repository.getAllQuotes()

}