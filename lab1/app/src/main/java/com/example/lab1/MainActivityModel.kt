package com.example.lab1

import android.content.Context
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivityModel: ViewModel() {
    var persistedText = "";

    fun changeTextButton(textView: TextView) {
        persistedText = (if(persistedText == "Origin") "Changed" else "Origin")
        textView.text = persistedText
    }
}