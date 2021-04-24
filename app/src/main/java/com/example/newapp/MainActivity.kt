package com.example.newapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun increment(view: View){
        val textView = findViewById<TextView>(R.id.increment_textview)
        var count = textView.text.toString().toInt()
        count++
        textView.text = count.toString()
    }

}