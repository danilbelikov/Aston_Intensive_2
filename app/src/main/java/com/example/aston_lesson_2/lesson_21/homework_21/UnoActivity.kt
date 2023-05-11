package com.example.aston_lesson_2.lesson_21.homework_21

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.aston_lesson_2.R
import com.example.aston_lesson_2.lesson_11.TAG
import com.example.aston_lesson_2.lesson_12_A.KEY_COUNTER

class UnoActivity : AppCompatActivity() {
    var mCount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uno)

        val bHello = findViewById<Button>(R.id.bHello)
        val bCount = findViewById<Button>(R.id.bCount)
        val mShowCount = findViewById<TextView>(R.id.show_count)

        mCount = savedInstanceState?.getInt(KEY_COUNTER) ?: 0
        renderState(mShowCount)

        bCount.setOnClickListener {
            increment(mShowCount)
        }

        bHello.setOnClickListener {
            val intent = Intent(this, DosActivity::class.java)
            intent.putExtra(TAG, mCount.toString())
            startActivity(intent)
        }
    }

    private fun increment(view: TextView) {
        mCount++
        view.text = mCount.toString()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(KEY_COUNTER, mCount)
    }

    private fun renderState(view: TextView) {
        view.text = mCount.toString()
    }
}