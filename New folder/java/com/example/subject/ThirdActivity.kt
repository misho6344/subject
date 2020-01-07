package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dava_leba.R
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val name = intent.extras?.getString("სახელი", "")
        val sqesi = intent.extras?.getString("სქესი", "")


        finishBtn.setOnClickListener {


            val email = inputEmail.text.toString()

            val intent = Intent(this, FinishActivity::class.java)
            intent.putExtra("E-mail", email)
            intent.putExtra("სახელი", name)
            intent.putExtra("სქესი", sqesi)
            startActivity(intent)
            finish()

        }
    }
}
