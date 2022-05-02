package com.example.examplemvvm.domain

import com.example.examplemvvm.data.Model.QuoteModel
import com.example.examplemvvm.data.Model.QuoteProvider


class GetRandomQuoteUseCase {

    operator fun invoke():QuoteModel?{
        val quotes = QuoteProvider.quotes
        if (!quotes.isNullOrEmpty()){
            val randomNumber = (0..quotes.size-1).random()
            return quotes[randomNumber]
        }
        return null
    }
}