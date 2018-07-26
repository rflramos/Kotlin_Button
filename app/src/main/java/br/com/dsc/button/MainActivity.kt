package br.com.dsc.button

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_felipe.setOnClickListener {

            val intent = Intent(this, ActivityFelipe::class.java)
            startActivity(intent)

        }

        btn_rafael.setOnClickListener{

        val intent = Intent(this, ActivityRafael::class.java)
            startActivity(intent)
        }

        btn_ana.setOnClickListener{

            val intent = Intent(this, ActivityAna::class.java)
            startActivity(intent)
        }



    }


}
