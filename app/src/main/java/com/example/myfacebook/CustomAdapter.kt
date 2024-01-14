package com.example.myfacebook

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myfacebook.databinding.CustomListBinding

class CustomAdapter(val list: ArrayList<info>) : RecyclerView.Adapter<CustomAdapter.Holder>(){
    inner class Holder(val binding: CustomListBinding) : RecyclerView.ViewHolder(binding.root) {
        val icon = binding.ivCustom1
        val text = binding.tvCustom2
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.Holder {
        val binding = CustomListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: CustomAdapter.Holder, position: Int) {
        val item = list[position]
        with(holder) {
            icon.setImageResource(item.itemImage)
            text.text = item.itemTitle
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }


}
