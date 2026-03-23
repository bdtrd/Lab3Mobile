package com.kolyambus.lab3mobile

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TipFullActivity : AppCompatActivity() {
    lateinit var day : TextView
    lateinit var image: ImageView
    lateinit var header: TextView
    lateinit var shortDesc: TextView
    lateinit var longDesc: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tip_full_layout)

        val tip = intent.getSerializableExtra("tip") as Tip

        initPointers()

        day.text = getString(R.string.day_format, tip.day)
        image.setImageResource(tip.image)
        header.setText(tip.header)
        shortDesc.setText(tip.shortDesc)
        longDesc.setText(tip.longDesc)
    }

    fun initPointers() {
        day = findViewById(R.id.day)
        image = findViewById(R.id.tipIllust)
        header = findViewById(R.id.tip_header)
        shortDesc = findViewById(R.id.short_desc)
        longDesc = findViewById(R.id.long_desc)
    }
}
