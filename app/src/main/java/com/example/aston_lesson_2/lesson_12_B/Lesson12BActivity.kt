package com.example.aston_lesson_2.lesson_12_B

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.aston_lesson_2.R
import com.example.aston_lesson_2.lesson_12_A.KEY_COUNTER

class Lesson12BActivity : AppCompatActivity() {
    var mCount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson12_bactivity)

        val bCount = findViewById<Button>(R.id.bCount)
        val bToast = findViewById<Button>(R.id.bToast)
        val mShowCount = findViewById<TextView>(R.id.show_count)
        val bZero = findViewById<Button>(R.id.bZero)

        mCount = savedInstanceState?.getInt(KEY_COUNTER) ?: 0
        renderState(mShowCount, bZero, bCount)

        bCount.setOnClickListener {
            bZero.setBackgroundColor(applicationContext.getColor(R.color.pink))
            bCount.setBackgroundColor(applicationContext.getColor(R.color.teal_200))
            increment(mShowCount)
        }
        bToast.setOnClickListener {
            Toast.makeText(this, R.string.toast_message, Toast.LENGTH_LONG).show()
        }
        bZero.setOnClickListener {
            mCount = 0
            renderState(mShowCount, bZero, bCount)
            bZero.setBackgroundColor(applicationContext.getColor(R.color.gray))
            bCount.setBackgroundColor(applicationContext.getColor(R.color.blue))
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

    private fun renderState(view: TextView, bZero: Button, bCount: Button) {
        view.text = mCount.toString()
        if (mCount > 0) {
            bZero.setBackgroundColor(applicationContext.getColor(R.color.pink))
            bCount.setBackgroundColor(applicationContext.getColor(R.color.teal_200))
        }
    }
}