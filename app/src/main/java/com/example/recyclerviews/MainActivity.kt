package com.example.recyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvnames1:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayNames()
    }
    fun displayNames(){
        rvnames1=findViewById(R.id.rvnames1)
        var namesList= listOf<String>("Mary","David","Kenneth","Jane","Patience","Patrick","Stacy","Dennis","Phiona",
        "Derrick","Mandek","Diana","Jane","Aisha","Resty","Kamau","Wambui","Matei","Papai","Kabaka","Taurus","Riley","pompi",
        "Cate","Marie","Janet","Zillah","Loyce","Mish","Sandra","Kendi","Jeanine","Irene","Gilly","Barbs","Tanzeen")
        var namesAdapter=NamesRvAdapter(namesList)
//        rvnames1.layoutManager=LinearLayoutManager(baseContext)
//        Display list items vertically
//        rvnames1.layoutManager=GridLayoutManager(baseContext,2)
//        display list items in a grid like fashion
        rvnames1.layoutManager=LinearLayoutManager(baseContext,LinearLayoutManager.HORIZONTAL,false)
//horizontal display
        rvnames1.adapter=namesAdapter
    }

}