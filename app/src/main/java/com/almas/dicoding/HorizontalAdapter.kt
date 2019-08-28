package com.almas.dicoding

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.ArrayList

class HorizontalAdapter(val listCake: ArrayList<Cake>) : RecyclerView.Adapter<HorizontalAdapter.ViewHolder>() {

    private val TAG = "RecyclerViewAdapter"
    private lateinit var onItemClickCallback: OnItemHorizontalClickCallback

    interface OnItemHorizontalClickCallback{
        fun onItemClicked(data : Cake)
    }
    fun setOnItemClickCallback(onItemClickCallback: OnItemHorizontalClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.image_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.layout_listitem, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listCake.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d(TAG, "onBindViewHolder: called.")

        val (name, detail, photo) = listCake[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(65, 65))
            .into(holder.imgPhoto)

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listCake[holder.adapterPosition])
        }
    }
}