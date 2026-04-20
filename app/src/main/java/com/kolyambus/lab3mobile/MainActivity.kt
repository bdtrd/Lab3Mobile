package com.kolyambus.lab3mobile

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rView = findViewById<RecyclerView>(R.id.recyclerView)
        rView.layoutManager = LinearLayoutManager(this, rViewOrientation(), false)
        rView.adapter = TipAdapter(
            TipList.tips
        ) { tip ->
            val intent = Intent(this, TipFullActivity::class.java)
            intent.putExtra("tip", tip)
            startActivity(intent)
        }
    }

    fun rViewOrientation(): Int {
        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE)
            return LinearLayoutManager.HORIZONTAL
        return LinearLayoutManager.VERTICAL
    }
}