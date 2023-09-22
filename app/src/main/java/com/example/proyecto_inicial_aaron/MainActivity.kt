package com.example.proyecto_inicial_aaron

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

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

    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState!=null){
            hp1=savedInstanceState.getInt("hp1")
            hp2=savedInstanceState.getInt("hp2")
            vn1=savedInstanceState.getInt("vn1")
            vn2=savedInstanceState.getInt("vn2")
            actualizar()
        }

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

        findViewById<FloatingActionButton>(R.id.reset).setOnClickListener{
            hp1=25
            hp2=25
            vn1=0
            vn2=0
            actualizar()
        }


    }

    @Override
    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        outPersistentState.putInt("hp1",hp1)
        outPersistentState.putInt("hp2",hp2)
        outPersistentState.putInt("vn1",vn1)
        outPersistentState.putInt("vn2",vn2)

        super.onSaveInstanceState(outState, outPersistentState)
    }

}