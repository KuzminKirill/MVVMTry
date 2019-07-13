package com.example.mvvmtry.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.mvvmtry.data.Quote
import com.example.mvvmtry.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository):
    ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)

}