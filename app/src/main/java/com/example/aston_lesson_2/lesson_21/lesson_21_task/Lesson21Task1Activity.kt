package com.example.aston_lesson_2.lesson_21.lesson_21_task

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.aston_lesson_2.MainActivity
import com.example.aston_lesson_2.R
import com.example.aston_lesson_2.lesson_21.EXTRA_MESSAGE

val LOG_TAG: String = MainActivity::class.java.simpleName
const val EXTRA_REPLY = "com.example.android.aston_2.extra.REPLY"

class Lesson21Task1Activity : AppCompatActivity() {
    private var launcher: ActivityResultLauncher<Intent>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson21_task1)

        val tvRecieved = findViewById<TextView>(R.id.text_header_reply)
        val tvMessageRecieved = findViewById<TextView>(R.id.text_message_reply)

        launcher =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
                if (result.resultCode == RESULT_OK) {
                    val text = result.data?.getStringExtra(EXTRA_REPLY)
                    tvMessageRecieved.text = text
                    tvMessageRecieved.visibility = View.VISIBLE
                    tvRecieved.visibility = View.VISIBLE
                }
            }
        var mMessageEditText: EditText? = null
        mMessageEditText = findViewById(R.id.editText_main)

        val mainButton = findViewById<Button>(R.id.button_main)

        mainButton.setOnClickListener {
            val intent = Intent(this, Lesson21Task2Activity::class.java)
            val message = mMessageEditText.text.toString()
            intent.putExtra(EXTRA_MESSAGE, message)
            launcher!!.launch(intent)
            Log.d(LOG_TAG, "Button clicked")
        }
    }
}