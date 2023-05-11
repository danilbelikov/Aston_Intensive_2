package com.example.aston_lesson_2.lesson_21.homework_21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.aston_lesson_2.R
import com.example.aston_lesson_2.lesson_11.TAG

class DosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dos)

        val tvHello = findViewById<TextView>(R.id.tvHello)
        val countRecieved = intent.getStringExtra(TAG)
        tvHello.text = "${getString(R.string.hello_sign)} \n $countRecieved"

    }
}