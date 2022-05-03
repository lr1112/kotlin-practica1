package com.example.examplemvvm.domain

import com.example.examplemvvm.data.Model.QuoteModel
import com.example.examplemvvm.data.Model.QuoteRepository
import javax.inject.Inject

class GetQuoteUseCase @Inject constructor(private val repository:QuoteRepository) {

    suspend operator fun invoke():List<QuoteModel>? =  repository.getAllQuotes()

}