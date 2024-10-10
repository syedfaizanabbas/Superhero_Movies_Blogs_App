package com.example.moviesnews

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailActivty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_activty)
        val img = intent.getIntExtra("img", 0)
        val title = intent.getStringExtra("title")
        val desc = intent.getStringExtra("desc")
        val author = intent.getStringExtra("author")
        val time = intent.getStringExtra("time")
        val detail = intent.getStringExtra("detail")
        val imageView = findViewById<ImageView>(R.id.img)
        val titleView = findViewById<TextView>(R.id.title1)
        val descView = findViewById<TextView>(R.id.desc1)
        val authorView = findViewById<TextView>(R.id.author1)
        val timeView = findViewById<TextView>(R.id.time1)
        val detailView = findViewById<TextView>(R.id.detail)
        imageView.setImageResource(img)
        titleView.text = title
        descView.text = desc
        authorView.text = author
        timeView.text = time
        detailView.text = detail
    }
}