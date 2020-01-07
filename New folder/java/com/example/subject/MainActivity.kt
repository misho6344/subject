package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dava_leba.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gotoSecondBtn.setOnClickListener {


            val sqesi = inputSqesi.text.toString()

            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("სქესი", sqesi)
            startActivity(intent)

            finish()
        }
    }
}
