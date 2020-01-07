package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dava_leba.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)


        val name = intent.extras?.getString("სახელი", "")
        val sqesi = intent.extras?.getString("სქესი", "")
        val email = intent.extras?.getString("E-mail", "")


        showSqesi.text = sqesi
        showSaxeli.text = name
        showEmail.text = email



    }
}
