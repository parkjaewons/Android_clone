package com.example.myfacebook

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class Data(val context: Context, val info: ArrayList<info>) : BaseAdapter() {


    override fun getItem(position: Int): Any {
        return info[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.custom_list, null)

        val photo = view.findViewById<ImageView>(R.id.iv_custom1)
        val text = view.findViewById<TextView>(R.id.tv_custom2)

        val infolist = info[position]
        val resourceId =
            context.resources.getIdentifier(infolist.icon, "drawable", context.packageName)
        text.setTextColor(Color.WHITE)
        photo.setImageResource(resourceId)
        text.text = infolist.list

        return view
    }

    override fun getCount(): Int {
        return info.size
    }

}
