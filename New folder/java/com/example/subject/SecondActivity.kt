package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dava_leba.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val sqesi = intent.extras?.getString("სქესი", "")

        gotoThirdBtn.setOnClickListener {

            val name = inputSaxeli.text.toString()

            val intent = Intent(this, ThirdActivity::class.java)

            intent.putExtra("სახელი", name)
            intent.putExtra("სქესი", sqesi)
            startActivity(intent)
            finish()
        }
    }
}
