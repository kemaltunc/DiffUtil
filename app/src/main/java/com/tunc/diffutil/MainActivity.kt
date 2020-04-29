package com.tunc.diffutil

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Callback {

    val adapter = ContentAdapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycler.adapter = adapter
        fillAdapter()

    }


    private fun fillAdapter() {
        adapter.items = listOf(
            Content(1, "text1", "23213"),
            Content(2, "text2", "23123"),
            Content(3, "text3", "123123"),
            Content2(4, "text4", "123123"),
            Content2(5, "text4", "123123"),
            Content2(6, "text4", "123123"),
            Content2(7, "text4", "123123")
        )

    }

    override fun removeItem(content: Content) {
        val tempList = adapter.items.toMutableList()
        tempList.remove(content)

        adapter.items = tempList

    }
}
