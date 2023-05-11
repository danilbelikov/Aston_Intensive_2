package com.example.aston_lesson_2.lesson_21

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.aston_lesson_2.R
const val EXTRA_MESSAGE = "com.example.android.aston_2.extra.MESSAGE"
const val EXTRA_MESSAGE2 = "com.example.android.aston_2.extra.MESSAGE2"
const val EXTRA_MESSAGE3 = "com.example.android.aston_2.extra.MESSAGE3"
class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val bText1 = findViewById<Button>(R.id.bText1)
        val bText2 = findViewById<Button>(R.id.bText2)
        val bText3 = findViewById<Button>(R.id.bText3)

        bText1.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(EXTRA_MESSAGE, getString(R.string.article_text))
            startActivity(intent)
        }
        bText2.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(EXTRA_MESSAGE2, getString(R.string.article_second))
            startActivity(intent)
        }
        bText3.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(EXTRA_MESSAGE3, getString(R.string.article_third))
            startActivity(intent)
        }
    }
}