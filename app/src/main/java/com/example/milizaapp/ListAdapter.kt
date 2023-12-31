package com.example.milizaapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ListAdapter (context: Context, dataArrayList: ArrayList<ListData?>?):
    ArrayAdapter<ListData?>(context,R.layout.list_item,dataArrayList!!) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var view = convertView
        val listData= getItem(position)

        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.list_item, parent,false)
        }

            val listImage = view!!.findViewById<ImageView>(R.id.listimage)
            val listname = view.findViewById<TextView>(R.id.listname)

        if (listData != null) {
            listImage.setImageResource(listData.image)
        }
        if (listData != null) {
            listname.text = listData.name
        }


        return view

    }
}