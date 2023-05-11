package com.example.aston_lesson_2.lesson_22.challenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.aston_lesson_2.R
import com.example.aston_lesson_2.lesson_12_A.KEY_COUNTER
import com.example.aston_lesson_2.lesson_21.EXTRA_MESSAGE
import com.example.aston_lesson_2.lesson_21.lesson_21_task.EXTRA_REPLY

class ListActivity : AppCompatActivity() {

    private var launcher: ActivityResultLauncher<Intent>? = null
    var addedItems = arrayListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val bAddItem = findViewById<Button>(R.id.bAddItem)
        val tvItem1 = findViewById<TextView>(R.id.item1)
        val tvItem2 = findViewById<TextView>(R.id.item2)
        val tvItem3 = findViewById<TextView>(R.id.item3)
        val tvItem4 = findViewById<TextView>(R.id.item4)
        val tvItem5 = findViewById<TextView>(R.id.item5)
        val tvItem6 = findViewById<TextView>(R.id.item6)
        val tvItem7 = findViewById<TextView>(R.id.item7)
        val tvItem8 = findViewById<TextView>(R.id.item8)
        val tvItem9 = findViewById<TextView>(R.id.item9)
        val tvItem10 = findViewById<TextView>(R.id.item10)
        val tvViewsArray = arrayListOf<TextView>(
            tvItem1, tvItem2, tvItem3, tvItem4, tvItem5,
            tvItem6, tvItem7, tvItem8, tvItem9, tvItem10
        )

        addedItems = savedInstanceState?.getStringArrayList(KEY_COUNTER) ?: arrayListOf()
        renderState(tvViewsArray)

        launcher =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
                if (result.resultCode == RESULT_OK) {
                    val text = result.data?.getStringExtra(EXTRA_REPLY)
                    addedItems.add(text!!)
                    for (i in tvViewsArray.indices) {
                        if (tvViewsArray[i].text.isNullOrEmpty()) {
                            tvViewsArray[i].text = text
                            break
                        }
                    }
                }
            }
        bAddItem.setOnClickListener {
            val intent = Intent(this, SelectActivity::class.java)
            launcher!!.launch(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putStringArrayList(KEY_COUNTER, addedItems)
    }

    private fun renderState(viewArray: ArrayList<TextView>) {
        for (i in addedItems.indices) {
            viewArray[i].text = addedItems[i]
        }
    }
}