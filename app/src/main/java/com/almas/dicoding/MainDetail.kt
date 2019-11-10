package com.almas.dicoding

import android.content.Intent
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
    private lateinit var rilis: TextView
    private lateinit var detail: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_detail)

        image = findViewById(R.id.gambar)
        title = findViewById(R.id.judul)
        rilis = findViewById(R.id.rilis)
        detail = findViewById(R.id.detail)

        val movie = intent.getParcelableExtra(EXTRA_NAME) as Movie

//        val nameMovie = intent.getParcelableExtra(EXTRA_NAME) as nameMovie
//        val rilis = intent.getParcelableExtra<>(EXTRA_RILIS)
//        val details = intent.getParcelableExtra<>(EXTRA_DETAILS)
//        val photo = intent.getParcelableExtra<>(EXTRA_PHOTO)

        title.text = "${movie.judul.toString()}"
        rilis.text = "${movie.rilis.toString()}"
        detail.text = "${movie.detail.toString()}"
        loadImagefromUrl("${movie.poster.toString()}")
    }

    private fun loadImagefromUrl(poster: String?) {
        Picasso.with(this).load(poster).placeholder(R.mipmap.ic_launcher)
            .error(R.mipmap.ic_launcher)
            .into(image)
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
    }

}

