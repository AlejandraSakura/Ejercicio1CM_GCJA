package com.example.ejercicio1cm_gcja

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        fun Rectangulo(Variable1: Int, Variable2: Int): Int {
            val areaRectangulo = Variable1 * Variable2
            return areaRectangulo
        }

        fun areaTriangulo(Variable1: Int, Variable2: Int): Int {
            val areaT = Variable1 * Variable2
            val areaTriangulo = areaT/2
            return areaTriangulo
        }

        fun area(Variable1: Int, Variable2: Int): Int {
            val areaT = Variable1 * Variable2
            val areaTriangulo = areaT/2
            return areaTriangulo
        }
    }

}