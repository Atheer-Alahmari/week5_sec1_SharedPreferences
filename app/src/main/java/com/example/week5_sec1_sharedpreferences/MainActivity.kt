package com.example.week5_sec1_sharedpreferences

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var fn:EditText
    lateinit var ln:EditText
    lateinit var int:Button
    lateinit var sh:Button

    lateinit var shf:SharedPreferences
    lateinit var edtor:SharedPreferences.Editor
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fn=findViewById(R.id.nED)
        ln=findViewById(R.id.nED2)
        int=findViewById(R.id.int_btn)
        sh=findViewById(R.id.sh_btn)

        shf=getSharedPreferences("Atheer", MODE_PRIVATE)//
        edtor=shf.edit()//

        int.setOnClickListener {
            var input=fn.text.toString()+" "+ln.text.toString()
            var intent = Intent(applicationContext,MainActivity2::class.java)
            intent.putExtra("send",input)
            startActivity(intent)
        }

        sh.setOnClickListener {
            var input=fn.text.toString()+" "+ln.text.toString()
            edtor.putString("key",input)
            edtor.commit()
        }
    }
}