package com.example.examplemvvm.ui.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.examplemvvm.data.Model.QuoteModel
import com.example.examplemvvm.data.Model.QuoteProvider

class QuoteViewModel: ViewModel() {
    val quoteModel = MutableLiveData<QuoteModel>()
    fun randomQuote(){
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}