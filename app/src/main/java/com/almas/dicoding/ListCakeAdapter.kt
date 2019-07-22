package com.almas.dicoding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import org.w3c.dom.Text
import java.util.ArrayList

class ListCakeAdapter(val listCake: ArrayList<Cake>) : RecyclerView.Adapter<ListCakeAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_cake, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listCake.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, detail, photo) = listCake[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(65,65))
            .into(holder.imgPhoto)

        holder.tvName.text = name
        holder.tvDetail.text = detail

        holder.itemView.setOnClickListener{ onItemClickCallback.onItemClicked(listCake[holder.adapterPosition])        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_from)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    interface OnItemClickCallback{
        fun onItemClicked(data : Cake)
    }
}