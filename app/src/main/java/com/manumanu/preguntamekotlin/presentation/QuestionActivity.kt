package com.manumanu.preguntamekotlin.presentation

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.manumanu.preguntamekotlin.R
import com.manumanu.preguntamekotlin.data.Question
import com.manumanu.preguntamekotlin.util.pablateQuestions
import kotlinx.android.synthetic.main.layout_question.*
import org.jetbrains.anko.toast

/**
 * Created by manu on 08/04/17.
 */

class QuestionActivity : AppCompatActivity(){

    var success:Int =0
    var fail:Int =0
    var current:Int = 0
    var listQuestion = listOf<Question>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_question)
        listQuestion = pablateQuestions()

        rv_answers.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rv_answers.setHasFixedSize(true)
        nextQuestion()
    }

    fun nextQuestion(){
        if(current<listQuestion.size){
            var q:Question = listQuestion[current]
            current++
            tv_text.text = q.text
            rv_answers.adapter = AnswerAdapter(q.answers){ (_, correct) ->
                    if(correct){
                        success++
                        toast("Bien!!")
                    }else{
                        fail++
                        toast("Fallaste!!")
                    }
                val handler = Handler()
                handler.postDelayed({
                    nextQuestion()
                },1000)
            }

        }else{
            val intent = Intent(this, ResultActivity::class.java )
            intent.putExtra("success", success)
            intent.putExtra("fail", fail)
            startActivity(intent)
            finish()
        }
    }

}
