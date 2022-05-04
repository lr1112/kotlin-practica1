package com.example.examplemvvm.domain


import com.example.examplemvvm.data.QuoteRepository
import com.example.examplemvvm.data.database.entities.toDatabase
import com.example.examplemvvm.domain.model.Quote
import javax.inject.Inject

class GetQuoteUseCase @Inject constructor(private val repository: QuoteRepository) {

    suspend operator fun invoke():List<Quote>{
        val quotes = repository.getAllQuotesFromApi()

       return  if (quotes.isNotEmpty()) {
            repository.clearQuotes()
            repository.insertQuotes(quotes.map { it.toDatabase() })
            quotes
        }else{
            repository.getAllQuotesFromDatabase()
        }

    }

}