package com.example.calculadoracomissao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Calculadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        val button = findViewById<Button>(R.id.btnCalcular)
        button.setOnClickListener {
            val SalF = findViewById<EditText>(R.id.edtSalF)
            val kmr = findViewById<EditText>(R.id.edtKm)
            val SalTot = findViewById<TextView>(R.id.txtSalr)
            val nSalF = SalF?.text.toString().toDouble()
            val nkmr = kmr?.text.toString().toDouble()

            if (nkmr<=500.00) {
                var kmresult1 = (0.10/100.00 * nSalF * nkmr) + nSalF
                SalTot.text = kmresult1.toString()
            }
            else if (nkmr>500.00 && nkmr<=1000.00) {
                var kmresult2 = (0.15/100.00 * nSalF * nkmr) + nSalF
                SalTot.text = kmresult2.toString()
            }
            else if(nkmr>1000.00 && nkmr<=2000.00) {
                var kmresult3 = (0.25/100.00 * nSalF * nkmr) + nSalF
                SalTot.text = kmresult3.toString()
            }
            else if (nkmr>2000.00){
                var kmresult4 = (0.30/100.00 * nSalF * nkmr) + nSalF
                SalTot.text = kmresult4.toString()
            }

        }
    }
}