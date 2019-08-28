package com.almas.dicoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var rvCake: RecyclerView
    private lateinit var rvHorizontal: RecyclerView
    private var list: ArrayList<Cake> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvCake = findViewById(R.id.rv_cake)
        rvCake.setHasFixedSize(true)

        rvHorizontal = findViewById(R.id.rv_cake_horizontal)
        rvHorizontal.setHasFixedSize(true)

        list.addAll(CakeData.listData)
        showRecyclerList()


    }

    private fun showRecyclerList(){
        rvCake.layoutManager = LinearLayoutManager(this)
        val listCakeAdapter = ListCakeAdapter(list)
        rvCake.adapter = listCakeAdapter

        rvHorizontal.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val horizontalAdapter = HorizontalAdapter(list)
        rvHorizontal.adapter = horizontalAdapter

        listCakeAdapter.setOnItemClickCallback(object : ListCakeAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Cake) {
                //showSelectedCake(data)
                    val intent = Intent(this@MainActivity, MainDetail::class.java)
                    intent.putExtra(MainDetail.EXTRA_NAME, data.name)
                    intent.putExtra(MainDetail.EXTRA_DETAILS, data.detail)
                    intent.putExtra(MainDetail.EXTRA_PHOTO, data.photo)
                    startActivity(intent)
            }
        })


        horizontalAdapter.setOnItemClickCallback(object : HorizontalAdapter.OnItemHorizontalClickCallback{
            override fun onItemClicked(data: Cake) {
                val intent = Intent(this@MainActivity, MainDetail::class.java)
                intent.putExtra(MainDetail.EXTRA_PHOTO, data.photo)
                startActivity(intent)
            }
        })
    }
}
