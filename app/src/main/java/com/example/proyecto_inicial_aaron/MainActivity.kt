package com.example.proyecto_inicial_aaron

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var hp1=25
    private var hp2=25
    private var vn1=0
    private var vn2=0

    @SuppressLint("SetTextI18n")
    private fun actualizar() {
        findViewById<TextView>(R.id.text1_hp).text = "$hp1/$vn1"
        findViewById<TextView>(R.id.text2_hp).text = "$hp2/$vn2"
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<ImageButton>(R.id.btn1_hp_mas).setOnClickListener{
            hp1++
            actualizar()
        }
        findViewById<ImageButton>(R.id.btn2_hp_mas).setOnClickListener{
            hp2++
            actualizar()
        }
        findViewById<ImageButton>(R.id.btn1_hp_menos).setOnClickListener{
            hp1--
            actualizar()
        }
        findViewById<ImageButton>(R.id.btn2_hp_menos).setOnClickListener{
            hp2--
            actualizar()
        }

        findViewById<ImageButton>(R.id.flecha1).setOnClickListener{
            hp1++
            hp2--
            actualizar()
        }

        findViewById<ImageButton>(R.id.flecha2).setOnClickListener{
            hp1--
            hp2++
            actualizar()
        }

        findViewById<Button>(R.id.btn1_vn_mas).setOnClickListener{
            vn1++
            actualizar()
        }
        findViewById<Button>(R.id.btn1_vn_menos).setOnClickListener{
            vn1--
            actualizar()
        }

        findViewById<Button>(R.id.btn2_vn_mas).setOnClickListener{
            vn2++
            actualizar()
        }
        findViewById<Button>(R.id.btn2_vn_menos).setOnClickListener{
            vn2--
            actualizar()
        }

    }

}