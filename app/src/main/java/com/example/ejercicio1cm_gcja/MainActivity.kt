package com.example.ejercicio1cm_gcja

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.ejercicio1cm_gcja.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tvResultado: TextView
    private lateinit var etNumero1: EditText
    private lateinit var etNumero2: EditText
    private lateinit var  binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val spinner = findViewById<Spinner>(R.id.SpnOperacion)
        val lista =resources.getStringArray(R.array.Opciones)
        val adaptador = ArrayAdapter(this,android.R.layout.simple_spinner_item,lista)
        spinner.adapter =adaptador
        spinner.onItemSelectedListener = object:
            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Toast.makeText(this@MainActivity, lista[p2], Toast.LENGTH_LONG).show()
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {}
        }

    }

    fun click(view: View) {
        with(binding){
        if(!etNumero1.text.toString().isEmpty() && !etNumero2.text.toString().isEmpty() ){

        }else{
            Toast.makeText(this@MainActivity,"",Toast.LENGTH_SHORT).show()
            if(!etNumero1.text.toString().isNotEmpty() && !etNumero2.text.toString().isNotEmpty()){
                etNumero1.error = getString(R.string.AmbosValores)
                etNumero2.error = getString(R.string.AmbosValores)
            }else if (!etNumero1.text.toString().isNotEmpty()){
                etNumero1.error = getString(R.string.UnValor)
            }else {
                etNumero2.error = getString(R.string.UnValor)
            }}
        }
    }

}
