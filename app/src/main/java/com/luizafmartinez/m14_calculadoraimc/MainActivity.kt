package com.luizafmartinez.m14_calculadoraimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnCalcular: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular = findViewById(R.id.btn_calcular)

        btnCalcular.setOnClickListener {

            val intent = Intent(
                this,
                ResultadoActivity::class.java
            )

            // Passar parâmetros para outra activity
            /*
             intent.putExtra("filme","The Witcher")
             intent.putExtra("classificacao",5)
             intent.putExtra("avaliacoes",9.2)
             */

           /* val filme = Filme(
                "Sem limites",
                "Teste",
                4.8,
                "Jamilton",
                "Netflix"
            )*/

            //intent.putExtra("filme", filme)

            startActivity( intent )

        }






    }
}