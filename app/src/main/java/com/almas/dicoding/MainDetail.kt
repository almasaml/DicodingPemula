package com.almas.dicoding

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextClock
import android.widget.TextView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main_detail.*

class MainDetail : AppCompatActivity() {
    private lateinit var image: ImageView
    private lateinit var title: TextView
    private lateinit var detail: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_detail)

        image = findViewById(R.id.gambar)
        title = findViewById(R.id.judul)
        detail = findViewById(R.id.detail)

        val nameCake = intent.getStringExtra(EXTRA_NAME)
        val details = intent.getStringExtra(EXTRA_DETAILS)
        val photo = intent.getStringExtra(EXTRA_PHOTO)

        title.setText(nameCake)
        detail.setText(details)
        loadImagefromUrl(photo)
    }

    private fun loadImagefromUrl(photo: String?) {
        Picasso.with(this).load(photo).placeholder(R.mipmap.ic_launcher)
            .error(R.mipmap.ic_launcher)
            .into(image)
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAILS = "extra_details"
        const val EXTRA_PHOTO = "extra_photo"
    }

}

