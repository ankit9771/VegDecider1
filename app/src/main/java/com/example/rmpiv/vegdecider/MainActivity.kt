package com.example.rmpiv.vegdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var veglist = arrayListOf("potato","Pumpkin","Bitter Melon")
        decider_veg.setOnClickListener {
            val random = Random()
            var vegin = random.nextInt(veglist.count())
            veg_nam.text=veglist[vegin]
        }
        button_add.setOnClickListener{
            val new_veg=add_bar.text.toString()
            veglist.add(new_veg)
            add_bar.text.clear()
        }
    }
}
