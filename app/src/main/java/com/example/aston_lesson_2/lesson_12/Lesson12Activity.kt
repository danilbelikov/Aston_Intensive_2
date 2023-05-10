package com.example.aston_lesson_2.lesson_12

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.aston_lesson_2.R

class Lesson12Activity : AppCompatActivity() {
    private var mCount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson12)

        val bCount = findViewById<Button>(R.id.bCount)
        val bToast = findViewById<Button>(R.id.bToast)
        val mShowCount = findViewById<TextView>(R.id.show_count)

        bCount.setOnClickListener {
            mCount++
            if (mShowCount != null) {
                mShowCount.text = mCount.toString()
            }
        }

        bToast.setOnClickListener {
            Toast.makeText(this, R.string.toast_message, Toast.LENGTH_LONG).show()
        }
    }
}
