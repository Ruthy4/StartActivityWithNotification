package com.example.week3assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //Get the intent that started the activity and extract the string
        val message = intent.getStringExtra("Active")
        // Get the intent that started the activity and extract the string
        val message1 = intent.getStringExtra("inActive")

        //capture the textView of the layout and set the string as its text
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = if (message == null) {
            message1
        } else message










    }
}