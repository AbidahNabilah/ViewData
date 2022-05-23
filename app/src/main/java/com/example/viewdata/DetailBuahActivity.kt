package com.example.viewdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_buah.*

class DetailBuahActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_buah)

        var tangkap = intent.getStringExtra("txt")
        var tangkap2 = intent.getIntExtra("img",0)

        detailtxt.text = tangkap
        imgdetail.setImageResource(tangkap2)
    }
}