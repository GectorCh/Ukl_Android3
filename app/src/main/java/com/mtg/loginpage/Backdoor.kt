package com.mtg.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Backdoor : AppCompatActivity() {
    lateinit var text: TextView
    lateinit var textDikirim: TextView
    lateinit var recycler: RecyclerView
    lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_backdoor)

        textDikirim = findViewById(R.id.dikirim)
        recycler = findViewById(R.id.recycler)

        val email = intent.getStringExtra("String")

        recycler.layoutManager = LinearLayoutManager(this)

        var data = ArrayList<Item>()
        data.addAll(ItemData().listData)

        adapter = Adapter(data)
        recycler.adapter = adapter
    }
}