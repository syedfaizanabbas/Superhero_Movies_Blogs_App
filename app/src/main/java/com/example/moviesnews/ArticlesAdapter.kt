package com.example.moviesnews

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ArticlesAdapter(val context: Context, val articles: List<Article>) : RecyclerView.Adapter<ArticleViewHolder>(){

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int){
        val article = articles[position]
        holder.title.text = article.title
        holder.desc.text = article.desc
        holder.img.setImageResource(article.img)
        holder.author.text = article.author
        holder.time.text = article.time
        holder.cons.setOnClickListener{
            val intent = Intent(holder.itemview.context, DetailActivty ::class.java)
            intent.putExtra("title", article.title)
            intent.putExtra("desc", article.desc)
            intent.putExtra("img", article.img)
            intent.putExtra("author", article.author)
            intent.putExtra("time", article.time)
            intent.putExtra("detail",article.detail)
            holder.itemview.context.startActivity(intent)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.activity_item_article, parent, false)
    return ArticleViewHolder(itemView)
    }

    override fun getItemCount(): Int{
        return articles.size

}
    }