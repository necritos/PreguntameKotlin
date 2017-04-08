package com.manumanu.preguntamekotlin.presentation

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.manumanu.preguntamekotlin.R
import com.manumanu.preguntamekotlin.data.Answer
import com.manumanu.preguntamekotlin.util.inflate
import kotlinx.android.synthetic.main.item_answer.view.*

/**
 * Created by manu on 08/04/17.
 */

class AnswerAdapter(var items: List<Answer>, var listener: (Answer) -> Unit) : RecyclerView.Adapter<AnswerAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder.itemView){
            rb_text.text = items[position].text
            rb_text.setOnClickListener {
                rb_text.isSelected = true
                listener(items[position])

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(parent.inflate(R.layout.item_answer))
    }

    override fun getItemCount(): Int {
        return items.size
    }


    class ViewHolder(view:View) : RecyclerView.ViewHolder(view)
}
