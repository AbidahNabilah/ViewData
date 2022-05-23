package com.example.viewdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recyler.*

class RecylerActivity : AppCompatActivity() {

    var dataBuah = arrayOf("alpukat","durian","jambuair","manggis","strawberry")
    var dataGambar = arrayOf(
        R.drawable.alpukat,
        R.drawable.durian,
        R.drawable.jambuair,
        R.drawable.manggis,
        R.drawable.strawberry
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyler)

        var adapter = CustomeAdapter(this, dataBuah, dataGambar)
        var liner = LinearLayoutManager(application)
        recylerview.adapter = adapter
        recylerview.layoutManager = liner
    }
}