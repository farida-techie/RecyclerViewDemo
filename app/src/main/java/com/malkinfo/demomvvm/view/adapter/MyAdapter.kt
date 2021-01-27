package com.malkinfo.demomvvm.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.malkinfo.demomvvm.R
import com.malkinfo.demomvvm.model.UserDAta

class MyAdapter(private var userLIst:List<UserDAta>) :RecyclerView.Adapter<MyAdapter.MyViewHolder>()
{

    inner class MyViewHolder(v:View):RecyclerView.ViewHolder(v){
        var userN = v.findViewById<TextView>(R.id.title)
        var userNe = v.findViewById<TextView>(R.id.sbTitle)
        var imag = v.findViewById<ImageView>(R.id.myImg)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val infater = LayoutInflater.from(parent.context)
        var v= infater.inflate(R.layout.item_view,parent,false)
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
      val userList = userLIst[position]
        holder.userN.text = userList.userName
        holder.userNe.text = userList.userNeckName
        holder.imag.setImageResource(userList.Image)
    }

    override fun getItemCount(): Int {
     return userLIst.size
    }
}