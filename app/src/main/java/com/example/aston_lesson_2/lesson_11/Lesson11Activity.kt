package com.example.aston_lesson_2.lesson_11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.aston_lesson_2.R
const val TAG = "Error"
class Lesson11Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson11)
        Toast.makeText(this,getString(R.string.challange11),Toast.LENGTH_LONG).show()

        try {
            val array = arrayListOf<Int>(1,2,3,4)
            array[4] = 1
        }
        catch(e: IndexOutOfBoundsException) {
            Log.e(TAG, getString(R.string.ops))
        }
    }
}