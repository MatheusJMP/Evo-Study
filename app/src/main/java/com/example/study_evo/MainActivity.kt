package com.example.study_evo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerAdapter : RecyclerViewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerAdapter = RecyclerViewAdapter(fakeCards())
        recycler_view_main.adapter = recyclerAdapter
        recycler_view_main.layoutManager = LinearLayoutManager(this)

        val images = listOf(
            R.drawable.ic_creditcard,
            R.drawable.ic_creditcard2
        )
        val adapter = ViewPagerAdapter(images)
        view_pager.adapter = adapter

    }
}