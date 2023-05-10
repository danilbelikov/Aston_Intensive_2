package com.example.aston_lesson_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.aston_lesson_2.lesson_11.Lesson11Activity
import com.example.aston_lesson_2.lesson_12.Lesson12Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button11 = findViewById<Button>(R.id.b1_1)
        val button12 = findViewById<Button>(R.id.b1_2)

        button11.setOnClickListener {
            val intent11 = Intent(this, Lesson11Activity::class.java)
            startActivity(intent11)
        }

        button12.setOnClickListener {
            val intent12 = Intent(this, Lesson12Activity::class.java)
            startActivity(intent12)
        }
    }
}