package com.example.lesson5_recard_201853004_a

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var list = ArrayList<Users>()
    var listUsers = arrayOf(
            "Adi",
            "Budi",
            "Cindi",
            "Dodi",
            "Edi",
            "Fuadi",
            "Gadi",
            "Hadi",
            "Isdi"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager(this)

        for (i in 0 until listUsers.size){

            list.add(Users(listUsers.get(i)))

                if (listUsers.size - 1 == i){
                    // init adapter yang telah dibuat tadi
                    val adapter = Adapter(list)
                    adapter.notifyDataSetChanged()

                    // tampilkan data dalam recycler view
                    mRecyclerView.adapter = adapter
                }
        }
    }
}