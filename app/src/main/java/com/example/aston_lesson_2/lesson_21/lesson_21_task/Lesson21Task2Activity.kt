package com.example.aston_lesson_2.lesson_21.lesson_21_task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.aston_lesson_2.R
import com.example.aston_lesson_2.lesson_21.EXTRA_MESSAGE

class Lesson21Task2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson21_task2)
        val intent = intent
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        val textView = findViewById<TextView>(R.id.text_message)
        textView.text = message

        val mReply = findViewById<EditText>(R.id.editText_second)
        val secondButton = findViewById<Button>(R.id.button_second)

        secondButton.setOnClickListener {
            val reply = mReply.text.toString()
            intent.putExtra(EXTRA_REPLY, reply)
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}