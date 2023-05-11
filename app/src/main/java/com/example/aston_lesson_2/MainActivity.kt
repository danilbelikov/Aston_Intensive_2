package com.example.aston_lesson_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.aston_lesson_2.lesoon_22homework.ExampleActivity
import com.example.aston_lesson_2.lesson_11.Lesson11Activity
import com.example.aston_lesson_2.lesson_11.TAG
import com.example.aston_lesson_2.lesson_12_A.Lesson12Activity
import com.example.aston_lesson_2.lesson_12_B.Lesson12BActivity
import com.example.aston_lesson_2.lesson_13.Lesson13Activity
import com.example.aston_lesson_2.lesson_21.FirstActivity
import com.example.aston_lesson_2.lesson_21.homework_21.UnoActivity
import com.example.aston_lesson_2.lesson_21.lesson_21_task.Lesson21Task1Activity
import com.example.aston_lesson_2.lesson_22.challenge.ListActivity
import com.example.aston_lesson_2.lesson_23.FinalActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button11 = findViewById<Button>(R.id.b1_1)
        val button12 = findViewById<Button>(R.id.b1_2)
        val button12b = findViewById<Button>(R.id.b12B)
        val button13 = findViewById<Button>(R.id.b13)
        val button14 = findViewById<Button>(R.id.b14)
        val button21 = findViewById<Button>(R.id.b21)
        val button21Task = findViewById<Button>(R.id.b21Task)
        val button21Homework = findViewById<Button>(R.id.b21Homework)
        val button22Challenge = findViewById<Button>(R.id.b22Challenge)
        val button22Homework = findViewById<Button>(R.id.b22Homework)
        val button23Homework = findViewById<Button>(R.id.b23Homework)

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
        button13.setOnClickListener {
            val intent13 = Intent(this, Lesson13Activity::class.java)
            startActivity(intent13)
        }
        button14.setOnClickListener {
            Toast.makeText(this, getString(R.string.icon_changed_string), Toast.LENGTH_LONG).show()
        }
        button21.setOnClickListener {
            val intent21 = Intent(this, FirstActivity::class.java)
            startActivity(intent21)
        }
        button21Task.setOnClickListener {
            val intent21Task = Intent(this, Lesson21Task1Activity::class.java)
            startActivity(intent21Task)
        }
        button21Homework.setOnClickListener {
            val intent21Homework = Intent(this, UnoActivity::class.java)
            startActivity(intent21Homework)
        }
        button22Challenge.setOnClickListener {
            val intent22Challenge = Intent(this, ListActivity::class.java)
            startActivity(intent22Challenge)
        }

        button22Homework.setOnClickListener {
            val intent22Homework = Intent(this, ExampleActivity::class.java)
            startActivity(intent22Homework)
        }

        button23Homework.setOnClickListener {
            val intent23Homework = Intent(this, FinalActivity::class.java)
            startActivity(intent23Homework)
        }
    }
}