package com.isikkaya.siniflarvefonksiyonlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var j = 0

        if (j == 0) {
            ilkFonksiyon()
        }else {
            ikinciFonksiyon()
        }
        cikarma(5,3)
        var x = toplama(20,30)
        textView.text = "Sonuç : ${x}"

        button.setOnClickListener {
            val toplamaSonucu = toplama(20,59)
            textView.text = "Sonuç : ${toplamaSonucu}"


        }
//on create de en son yazılan gözükür ekranda
        sinifCalismasi()
        nullGuvenligi()

    }
    
    fun ilkFonksiyon(){
        println("ilk fonksiyon calıstırıldı")
    }
    fun ikinciFonksiyon(){
        println("ikinci fonksiyon calıstırıldı")
    }
    //girdi almak

    fun cikarma(x: Int, y:Int) {
        textView.text = "Sonuç : ${x - y}"
    }

    //cıktı vermek -> döndürmek(return)

    fun toplama(a: Int, b:Int) : Int {
        return a + b
    }
    /*
    fun degistir(view : View){
        val toplamaSonucu = toplama(40,56)
        textView.text = "Sonuç : ${toplamaSonucu}"
    }

     */
    fun sinifCalismasi() {

        var superman = Superkahraman("Superman", 50, "Gazeteci")
        textView.text = "Yaş: ${superman.yas}"
        superman.testFonksiyonu()
        println(superman.sacRenginiAl())
    }

    fun nullGuvenligi(){
        //null, Nullability, null safety
        //tanımlama defining
        var benimStringim : String?

        // initialization
        benimStringim = "Atıl"

        var benimYasim : Int? = null
        println(benimYasim)

        //benimYasim = 2
        // 1
        if (benimYasim != null) {

            println(benimYasim *2)
        } else{

            println("null geldi")
        }
        // 2

        // !! -> null olmayacak, ? -> null olabilir

        println(benimYasim?.minus(2))

        //3
        //elvis operatörü
        //benimYasim = 10
        val sonuc = benimYasim?.minus(2) ?: 10
        println(sonuc)
        // 4
        //let
        benimYasim = 5
        benimYasim.let {
            println(it * 5)

        }

    }





    }

