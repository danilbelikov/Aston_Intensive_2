package com.example.aston_lesson_2.lesson_23


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ShareCompat
import com.example.aston_lesson_2.R


class FinalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val bOpenWebsite = findViewById<Button>(R.id.open_website_button)
        val bLocation = findViewById<Button>(R.id.open_location_button)
        val bShare = findViewById<Button>(R.id.share_text_button)
        val edShare = findViewById<EditText>(R.id.share_edittext)
        val edWebsite = findViewById<EditText>(R.id.website_edittext)
        val edLocation = findViewById<EditText>(R.id.location_edittext)
        val bPicture = findViewById<Button>(R.id.bPicture)

        bOpenWebsite.setOnClickListener {
            val url: String = edWebsite.text.toString()
            val webpage: Uri = Uri.parse(url)
            val intent = Intent(Intent.ACTION_VIEW, webpage)
            startActivity(intent)
        }
        bLocation.setOnClickListener {
            val loc: String = edLocation.text.toString()
            val addressUri = Uri.parse("geo:0,0?q=$loc")
            val intent = Intent(Intent.ACTION_VIEW, addressUri)
            startActivity(intent)
        }
        bShare.setOnClickListener {
            val txt: String = edShare.text.toString()
            val mimeType = "text/plain"
            ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle(R.string.share_text_with)
                .setText(txt)
                .startChooser()
        }
        bPicture.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
    }
}