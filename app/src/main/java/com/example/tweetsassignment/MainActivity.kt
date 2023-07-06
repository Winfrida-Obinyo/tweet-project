package com.example.tweetsassignment
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var tweetAdapter: TweetAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Create a list of tweets
        val tweetList = listOf(
            Tweet("avatar1.png", "John Doe", "@johndoe", "This is my first tweet!"),
            Tweet("avatar2.png", "Jane Smith", "@janesmith", "Hello, Twitter world!"),
            Tweet("avatar3.png", "Jane Smith", "@janesmith", "Hello, Twitter world!"),
            Tweet("avatar4.png", "Jane Smith", "@janesmith", "Hello, Twitter world!"),
            Tweet("avatar5.png", "Jane Smith", "@janesmith", "Hello, Twitter world!"),
            Tweet("avatar6.png", "Jane Smith", "@janesmith", "Hello, Twitter world!"),
            Tweet("avatar7.png", "Jane Smith", "@janesmith", "Hello, Twitter world!"),
            Tweet("avatar8.png", "Jane Smith", "@janesmith", "Hello, Twitter world!"),
            Tweet("avatar9.png", "Jane Smith", "@janesmith", "Hello, Twitter world!"),
            Tweet("avatar10.png", "Jane Smith", "@janesmith", "Hello, Twitter world!"),

        )

        // Initialize the TweetAdapter with the tweet list
        tweetAdapter = TweetAdapter(tweetList)
        recyclerView.adapter = tweetAdapter
    }
}