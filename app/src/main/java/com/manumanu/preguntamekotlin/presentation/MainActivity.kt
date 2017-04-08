package com.manumanu.preguntamekotlin.presentation

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.manumanu.preguntamekotlin.R
import kotlinx.android.synthetic.main.activity_main.*
/**
 * Created by manu on 08/04/17.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_star.setOnClickListener {
            val intent = Intent(this,QuestionActivity::class.java)
            startActivity(intent)
            finish()
        }
    }


}
