package com.manumanu.preguntamekotlin.util

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.manumanu.preguntamekotlin.data.Answer
import com.manumanu.preguntamekotlin.data.Question

/**
 * Created by manu on 08/04/17.
 */

fun ViewGroup.inflate(layout: Int): View {
    return LayoutInflater.from(context).inflate(layout, this, false)
}


fun pablateQuestions(): List<Question> {
    val items: List<Question> = listOf(
            Question(listOf(
                    Answer("Lima", false),
                    Answer("Quito", false),
                    Answer("Bogotá", false),
                    Answer("Buenos Aires", true),
                    Answer("La Paz", false)
            ), "Capital de Argentina"),
            Question(listOf(
                    Answer("Bogotá", false),
                    Answer("Lima", true),
                    Answer("Buenos Aires", false),
                    Answer("Quito", false),
                    Answer("La Paz", false)
            ), "Capital de Perú"),
            Question(listOf(
                    Answer("Bogotá", false),
                    Answer("Buenos Aires", false),
                    Answer("Quito", true),
                    Answer("La Paz", false),
                    Answer("Lima", false)
            ), "Capital de Ecuador"),
            Question(listOf(
                    Answer("Bogotá", false),
                    Answer("Buenos Aires", false),
                    Answer("Lima", false),
                    Answer("Quito", false),
                    Answer("La Paz", true)
            ), "Capital de Bolivia"),
            Question(listOf(
                    Answer("Quito", false),
                    Answer("Bogotá", true),
                    Answer("Buenos Aires", false),
                    Answer("Lima", false),
                    Answer("La Paz", false)
            ), "Capital de Colombia")
    )
    return items
}

