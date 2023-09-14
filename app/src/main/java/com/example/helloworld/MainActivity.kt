package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView? = findViewById(R.id.activity_main_textview)//https://developer.android.com/guide/topics/resources/layout-resource#idvalue
        var myName: String = "THIS IS A NAME"//intentional, as this is in a public repo
        textView?.setText("Hi, my name is $myName")//https://developer.android.com/reference/android/widget/TextView#setText(java.lang.CharSequence)

    }
}