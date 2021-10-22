package com.example.week5_sec1_sharedpreferences

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var name: TextView
    lateinit var get: Button
    lateinit var shf: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        name=findViewById(R.id.text_View)
        get=findViewById(R.id.get_btn)

        var  send=intent.getStringExtra("send")
        name.text=send.toString()

        shf=getSharedPreferences("Atheer", MODE_PRIVATE)//

        get.setOnClickListener {

            val str = shf.getString("key"," no data with this key")//key
            name.text = str
        }
    }
}