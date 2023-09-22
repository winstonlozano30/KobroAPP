package com.example.kobrapp.ui.expenses

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ExpensesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Aqui va la vista de los egresos"
    }
    val text: LiveData<String> = _text
}