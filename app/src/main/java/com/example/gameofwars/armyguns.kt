package com.example.gameofwars

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import java.util.ArrayList

class armyguns : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.armyguns)
        val myListView =
            findViewById<View>(R.id.my_list_view) as ListView
        val layoutID = android.R.layout.simple_list_item_1
        val myStringArray = ArrayList<String>()
        val myAdapterInstance: ArrayAdapter<String>
        myAdapterInstance = ArrayAdapter(this, layoutID, myStringArray)
        myListView.adapter = myAdapterInstance
        myStringArray.add("M4/M4A1 CARBINE")
        myStringArray.add("M249 SQUAD AUTOMATIC WEAPON (SAW)")
        myStringArray.add("M24 SNIPER")
        myStringArray.add("M240L 7.62 MEDIUM MACHINE GUN")
        myStringArray.add("M2A1 .50 CALIBER MACHINE GUN")
        myStringArray.add("MK19 GRENADE MACHINE GUN")
        myStringArray.add("M14 7.62MM ENHANCED BATTLE RIFLE")
        myStringArray.add("XM2010 ENHANCED SNIPER RIFLE")
        myStringArray.add("M107 SEMI-AUTOMATIC LONG RANGE SNIPER")
        myAdapterInstance.notifyDataSetChanged()

    }
}