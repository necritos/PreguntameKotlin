package com.manumanu.preguntamekotlin.presentation

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.manumanu.preguntamekotlin.R
import kotlinx.android.synthetic.main.layout_result.*

/**
 * Created by manu on 08/04/17.
 */
class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_result)
        val fail = intent.getIntExtra("fail",0)
        val success = intent.getIntExtra("success",0)
        tv_resume.text = "Has obtenido un total de $success preguntas correctas y $fail incorrectas"
        btn_again.setOnClickListener {
            val intent = Intent(this, QuestionActivity::class.java )
            startActivity(intent)
            finish()
        }
    }


}
