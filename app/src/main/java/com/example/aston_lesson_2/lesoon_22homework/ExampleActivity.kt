package com.example.aston_lesson_2.lesoon_22homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.TestLooperManager
import android.widget.Button
import android.widget.TextView
import com.example.aston_lesson_2.R
import com.example.aston_lesson_2.lesson_12_A.KEY_COUNTER

class ExampleActivity : AppCompatActivity() {
    var mCout = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example)

        val tvNumber = findViewById<TextView>(R.id.tvNumber)
        val bCount = findViewById<Button>(R.id.bCount)
        mCout = savedInstanceState?.getInt(KEY_COUNTER) ?: 0
        renderState(tvNumber)
        bCount.setOnClickListener {
            mCout++
            tvNumber.text = mCout.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(KEY_COUNTER, mCout)
    }

    private fun renderState(view: TextView) {
        view.text = mCout.toString()
    }
}