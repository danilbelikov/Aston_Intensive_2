package com.example.aston_lesson_2.lesson_21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.aston_lesson_2.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val intent = intent
        val tvText = findViewById<TextView>(R.id.tvArticle)

        val article = intent.getStringExtra(EXTRA_MESSAGE)
        val articleSecond = intent.getStringExtra(EXTRA_MESSAGE2)
        val articleThird = intent.getStringExtra(EXTRA_MESSAGE3)

        when {
            !article.isNullOrEmpty() -> tvText.text = article
            !articleSecond.isNullOrEmpty() -> tvText.text = articleSecond
            !articleThird.isNullOrEmpty() -> tvText.text = articleThird
        }
    }
}