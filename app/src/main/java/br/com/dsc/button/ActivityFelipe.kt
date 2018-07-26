package br.com.dsc.button

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class ActivityFelipe : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_felipe)

    }

    fun clickFe(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
