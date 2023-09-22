package com.example.kobrapp.ui.income

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class IncomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Aqui va la vista de los ingresos"
    }
    val text: LiveData<String> = _text
}