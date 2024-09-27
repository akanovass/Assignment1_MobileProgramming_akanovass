package com.example.task1_ex4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.widget.ImageView
import android.widget.TextView

class PostAdapter(private val postList: List<Post>) : RecyclerView.Adapter<PostAdapter.PostViewHolder>() {

    class PostViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val postImage: ImageView = view.findViewById(R.id.postImage)
        val postCaption: TextView = view.findViewById(R.id.postCaption)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_post, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post = postList[position]
        holder.postImage.setImageResource(post.imageResId)
        holder.postCaption.text = post.caption
    }

    override fun getItemCount(): Int {
        return postList.size
    }
}
