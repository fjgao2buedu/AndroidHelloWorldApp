package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView? = findViewById(R.id.activity_main_textview)//https://developer.android.com/guide/topics/resources/layout-resource#idvalue
        val myName = "THIS IS A NAME"//intentional, as this is in a public repo
        textView?.text = getString(R.string.say_hello, myName)//https://developer.android.com/guide/topics/resources/string-resource#formatting-strings

    }
}