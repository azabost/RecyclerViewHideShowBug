package com.example.recyclerview.bug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val adapter = Adapter()

    private val item1 = Item(1, "1st item")
    private val item2 = Item(2, "2nd item")
    private val item3 = Item(3, "3rd item")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.adapter = adapter

        show3.setOnClickListener {
            adapter.submitList(listOf(item1, item2, item3))
            recyclerView.visibility = View.VISIBLE
        }
        show1.setOnClickListener {
            adapter.submitList(listOf(item1))
            recyclerView.visibility = View.VISIBLE
        }
        clearAndHide.setOnClickListener {
            adapter.submitList(emptyList())
            recyclerView.visibility = View.GONE
        }
    }
}