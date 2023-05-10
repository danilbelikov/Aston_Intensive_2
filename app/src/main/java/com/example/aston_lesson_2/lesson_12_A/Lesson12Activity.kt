package com.example.aston_lesson_2.lesson_12_A

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.aston_lesson_2.R
const val KEY_COUNTER = "Counter"
class Lesson12Activity : AppCompatActivity() {
    var mCount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson12)

        val bCount = findViewById<Button>(R.id.bCount)
        val bToast = findViewById<Button>(R.id.bToast)
        val mShowCount = findViewById<TextView>(R.id.show_count)

        mCount = savedInstanceState?.getInt(KEY_COUNTER) ?: 0
        renderState(mShowCount)

        bCount.setOnClickListener {
            increment(mShowCount)
        }

        bToast.setOnClickListener {
            Toast.makeText(this, R.string.toast_message, Toast.LENGTH_LONG).show()
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
