package com.example.mvvmtry.data

class FakeDatabase private  constructor() {
    var quoteDao = FakeQuoteDao()
        private set

    companion object {
        @Volatile private var instance: FakeDatabase? = null

        fun getInstasnce() =
                instance ?: synchronized(this){
                    instance ?: FakeDatabase().also { instance = it }
                }
    }
}