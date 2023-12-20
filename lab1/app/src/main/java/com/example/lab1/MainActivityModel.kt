package com.example.lab1

import android.content.Context
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivityModel: ViewModel() {
    fun changeTextButton(context: Context, textView: TextView) {
        if(textView.text == "Origin"){
            textView.text = "Changed"
        }
        else{
            textView.text = "Origin"
        }
    }
}