package com.example.aston_lesson_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.aston_lesson_2.lesson_11.Lesson11Activity
import com.example.aston_lesson_2.lesson_12_A.Lesson12Activity
import com.example.aston_lesson_2.lesson_12_B.Lesson12BActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button11 = findViewById<Button>(R.id.b1_1)
        val button12 = findViewById<Button>(R.id.b1_2)
        val button12b = findViewById<Button>(R.id.b12B)

        button11.setOnClickListener {
            val intent11 = Intent(this, Lesson11Activity::class.java)
            startActivity(intent11)
        }

        button12.setOnClickListener {
            val intent12 = Intent(this, Lesson12Activity::class.java)
            startActivity(intent12)
        }
        button12b.setOnClickListener {
            val intent12b = Intent(this, Lesson12BActivity::class.java)
            startActivity(intent12b)
        }

    }
}