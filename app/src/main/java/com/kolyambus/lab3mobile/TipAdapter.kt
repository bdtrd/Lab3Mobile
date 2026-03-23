package com.kolyambus.lab3mobile

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TipAdapter (val tipList: List<Tip>) : RecyclerView.Adapter<TipViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TipViewHolder {
        return TipViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.tip_card_layout, parent, false))
    }

    override fun onBindViewHolder(
        holder: TipViewHolder,
        position: Int
    ) {
        val tip = tipList[position]
        holder.day.text = tip.day.toString().padStart(2, '0')
        holder.header.setText(tip.header)
        holder.shortDesc.setText(tip.shortDesc)
        holder.image.setImageResource(tip.image)
    }

    override fun getItemCount(): Int {
        return tipList.size
    }
}