package com.example.moviesnews

import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class ArticleViewHolder (val itemview:View): RecyclerView.ViewHolder(itemview) {
    val title = itemview.findViewById<TextView>(R.id.title1)
    val desc = itemview.findViewById<TextView>(R.id.desc1)
    val img = itemview.findViewById<ImageView>(R.id.img)
    val author = itemview.findViewById<TextView>(R.id.author1)
    val time = itemview.findViewById<TextView>(R.id.time1)
    val cons = itemview.findViewById<ConstraintLayout>(R.id.cons)
}

