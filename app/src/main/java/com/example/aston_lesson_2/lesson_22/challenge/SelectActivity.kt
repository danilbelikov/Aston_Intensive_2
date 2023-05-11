package com.example.aston_lesson_2.lesson_22.challenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.aston_lesson_2.R
import com.example.aston_lesson_2.lesson_12_A.KEY_COUNTER
import com.example.aston_lesson_2.lesson_21.lesson_21_task.EXTRA_REPLY

class SelectActivity : AppCompatActivity() {
    var position = 0
    var currentWord = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select)

        val foodList = resources.getStringArray(R.array.food_names)
        val bSelect = findViewById<Button>(R.id.bSelect)
        val bNext = findViewById<Button>(R.id.bNext)
        val tvFood = findViewById<TextView>(R.id.tvFood)
        tvFood.text = currentWord

        currentWord = savedInstanceState?.getString(KEY_COUNTER) ?: foodList[0]
        renderState(tvFood)

        bSelect.setOnClickListener {
            val reply = tvFood.text
            currentWord = reply.toString()
            intent.putExtra(EXTRA_REPLY, reply)
            setResult(RESULT_OK, intent)
            position++
            finish()
        }

        bNext.setOnClickListener {
            position++
            if (position == 10) position = 0
            tvFood.text = foodList[position]
            currentWord = foodList[position]
        }
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(KEY_COUNTER, currentWord)
    }

    private fun renderState(view: TextView) {
        view.text = currentWord
    }
}