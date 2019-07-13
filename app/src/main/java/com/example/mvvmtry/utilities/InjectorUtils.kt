package com.example.mvvmtry.utilities

import com.example.mvvmtry.data.FakeDatabase
import com.example.mvvmtry.data.QuoteRepository
import com.example.mvvmtry.ui.quotes.QuotesViewModelFactory

object InjectorUtils {
    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {

        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstasnce().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}