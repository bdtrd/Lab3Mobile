package com.kolyambus.lab3mobile

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TipViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val image = itemView.findViewById<ImageView>(R.id.tipIllust)
    val day = itemView.findViewById<TextView>(R.id.dayNumber)
    val header = itemView.findViewById<TextView>(R.id.tipHeader)
    val shortDesc = itemView.findViewById<TextView>(R.id.tipShortDesc)
}