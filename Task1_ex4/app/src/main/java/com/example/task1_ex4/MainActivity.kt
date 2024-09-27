package com.example.task1_ex4
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val postList = listOf(
            Post(R.drawable.norv, "Norway1!"),
            Post(R.drawable.norway2, "Beautiful!"),
            Post(R.drawable.norv3, "An amazing view!")
        )

        recyclerView.adapter = PostAdapter(postList)
    }
}
