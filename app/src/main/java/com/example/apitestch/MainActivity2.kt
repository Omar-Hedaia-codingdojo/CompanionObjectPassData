package com.example.apitestch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity2 : AppCompatActivity() {
//    val vm by lazy { ViewModelProvider(this).get(MyVM::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val text  = findViewById<TextView>(R.id.textView3)

        val word = DefSingletone.word
        val defArray = DefSingletone.defList

        for (i in defArray)
        {
            text.text = text.text.toString() + "\n $word \n  ${i}"
        }




//                text.text = text.text.toString() + "$word + \n + ${def}"





//        intent.putExtra("word",data.word)
//        intent.putExtra("def",data.def[0].dif)
//        vm.getData("Name")
//        vm.getContents().observe(this,{
//            contents-> contents[0].def[0].dif
//            println(contents)
//        })
//        val contents=vm.getContents()
//        val i= contents?.value?.get(0)?.def?.get(0)?.dif
//        println(i)

    }
}