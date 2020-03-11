package com.example.gameofwars

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class airforce : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.airforce)
        val myListView =
            findViewById<View>(R.id.my_list_view) as ListView

        val layoutID = android.R.layout.simple_list_item_1

        val myStringArray = ArrayList<String>()

        val myAdapterInstance: ArrayAdapter<String>
        myAdapterInstance = ArrayAdapter(this, layoutID, myStringArray)

        myListView.adapter = myAdapterInstance


        myStringArray.add("AIRFORCE GUNS")
        myStringArray.add("AIRFORCE AMMUTIONS")

        myAdapterInstance.notifyDataSetChanged()



    }
}
