package com.isikkaya.ilkandroidim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("merhaba kotlin")
        println(5*10)

        //degiskenler(var) && sabitler(val)

        //Integer
        println("-------------------Int------------------")

        var a = 5
        var b = 10

        println(a * b)

        var yas = 50
        println(yas / 5 * 8)

        yas = 60 //degerini degistirdik ve sırayla gidiyor
        println(yas / 5 * 8)

        val x = 5
        val y = 20
        println(x + y)


        //camelCase yasSonucu genelde bunu kullanırız kotlinde
        //snake_case yas_sonucu
        val yasSonucu = yas * x
        println(yasSonucu)



        //Tanımlama (defining)
        val benimIntegerim : Int

        //Baslatma, Degerini Atama(Initializing, Initialization)
        benimIntegerim = 5

        var yeniInteger : Int = 20
        //asagıdaki sonuc 2 cıkıcak cünkü integer/integer = integer olarak algılıyor
        println(benimIntegerim / 2)

        //Long
        println("-------------------Long------------------")
        var benimLong : Long = 100
        benimLong = 3000000000
        println(benimLong)

        //Double && Float
        println("-------------------Double && Float------------------")

        val pi = 3.14
        println(pi * 2)
        val floatPi : Float = 3.14f
        println(floatPi * 2)
        // 2.5 olması icin ondalıklı sekilde yazmak lazım
        val yeniDouble = 5.0
        println(yeniDouble / 2)


        //String
        println("-------------------String------------------")

        val benimString = "Benim Yeni Metnim"
        println(benimString.length)

        val isim = "Işık"
        val soyisim ="Kaya"

        val tamisim = isim + " " + soyisim

        println(tamisim)

        val yeniBirString: String
        yeniBirString = "10"

        val baskaBirString = "20"
        println(yeniBirString + baskaBirString)

        //Booelean
        println("-------------------Boolean------------------")
        var benimBoolean = true
        benimBoolean = false

        // <
        // >
        // ==
        // !=
        // && ve
        // || veya
        println(3 < 5)

        //Veri Tipi Dönüştürme
        println("-------------------Dönüştürme------------------")

        val benimInt = 10
        val benimLongaCevrilenInt = benimInt.toLong()
        println(benimLongaCevrilenInt)

        val kullaniciGirdisi = "50"
        val kullaniciInt = kullaniciGirdisi.toInt()
        println(kullaniciInt / 2)

        //koleksiyonlar
        //Array- Dizi
        println("-------------------Dizi------------------")
        val stringOrnegi = "Işık"
        val benimDizim = arrayOf(stringOrnegi,"Kaya","Kağan","Berfin","Havva",)
//val dedik ama diziyi degil dizinin indexlerini degistiriyorız setle.
        println(benimDizim[0])
        println(benimDizim.get(1))
        benimDizim.set(3,"Aslı")
        println(benimDizim.get(3))

        val numaraDizisi = doubleArrayOf(1.0,2.0,3.5)
        println(numaraDizisi.get(2))

        val karisikDizi = arrayOf("Atıl",23,14,true)
        println(karisikDizi[2])

        //ArrayList - Listeler
        println("-------------------ArrayList------------------")

        val isimListesi = arrayListOf<String>("atıl","zeybep","osman")
        println(isimListesi.get(1))
        isimListesi.add("Mehmet")
        isimListesi.add("Atlas")
        println(isimListesi.get(4))

        val karisikArrayList = arrayListOf<Any>()
        karisikArrayList.add(("Atıl"))
        karisikArrayList.add(6)
        karisikArrayList.add(false)

        val intArrayList = ArrayList<Int>()
        intArrayList.add(5)
        intArrayList.add(7)
        println(intArrayList.get(1))

    //Set - no duplicate
        println("-------------------Set------------------")

        val ornekDizi = arrayOf(7,8,8,9,8,10)
        println("index 2: ${ornekDizi[2]}")
        println("index 3: ${ornekDizi[3]}")

        println(ornekDizi.size)

        val benimSet = setOf<Int>(7,8,9,9,8,10)
        println(benimSet.size)

        //For each
        benimSet.forEach {
            println(it)
        }
        val digerSet = HashSet<String>()
        digerSet.add("Atıl")
        digerSet.add("Atıl")
        digerSet.add("Atıl")
        digerSet.add("Kaya")

        digerSet.forEach {
            println(it)
        }
        //Map
        println("-------------------Map------------------")

        //Anahtar kelime - değer(Key-value Pairing)

        val yemekDizisi = arrayOf("elma","et","Tavuk")
        val KaloriDizisi = arrayOf(100,200,300)
        println("${yemekDizisi[0]}'nın Kalorisi : ${KaloriDizisi[0]}")

        val yemekKaloriMap = hashMapOf<String, Int>()
        yemekKaloriMap.put("elma",100)
        yemekKaloriMap.put("et",200)
        yemekKaloriMap.put("Tavuk",300)

        println(yemekKaloriMap.get("et"))

        val benimMapim = hashMapOf<String, String>()
        benimMapim.put("Örnek","Değer")

        val yeniMap = hashMapOf<String , Int>("Atıl" to 40,"Kurt" to 60)
        println(yeniMap.get("Kurt"))

        //Matematiksel islemler
        println("-------------------Matematiksel İşlemler------------------")
        var sayi = 8
        println(sayi)
        sayi = sayi + 1
        println(sayi)
        sayi++
        println(sayi)
        sayi--
        println(sayi)

        var digerSayi = 10
        println(digerSayi > sayi)

        // && ve || veya
        println(digerSayi > sayi && 2 > 3)
        println(7+5)
        println(7-4)
        //Remainder - Kalanı Bulmak
        println(11%3)

        //If kontrolleri
        println("-------------------If statements------------------")

        val skor = 80
        if (skor<10) {
            println("oyunu kaybettin!")
        } else if (skor >= 10 && skor < 20){
            println("Skorun 10 ve 20 arasında, çok iyi skor aldın")
        } else if (skor >= 20 && skor <30){
            println("skorun 20 ve 30 arasında,rekorlar kırıyosun")
        } else {
            println("skorun 30'un üzerinde, harikasın!")
        }

        //When kontrolleri
        println("-------------------When------------------")

        var notRakami = 2
        var notStringi = ""
        when(notRakami) {
            0 -> notStringi = "Geçersiz not"
            1 -> notStringi = "Zayıf"
            2 -> notStringi = "kötü"
            3 -> notStringi = "Orta"
            4 -> notStringi = "İyi"
            else -> notStringi = "Pek İyi"
        }
        println(notStringi)
/*
        if (notRakami == 0) {
            notStringi = "Geçersiz not"
        } else if (notRakami == 1) {
            notStringi = "Zayıf"
        } else if (notRakami == 2) {
            notStringi = "Kötü"
        } else if(notRakami == 3 ){
            notStringi = "orta"
        } else if(notRakami == 4) {
            notStringi = "iyi"
        } else {
            notStringi = "pek iyi"
        }
         */
//döngüler
        println("-------------------for döngüsü------------------")

        val baskaBirDizi = arrayOf(5,10,15,20,25,30)

        val q = baskaBirDizi[0] / 5 + 3
        println(q)

        println("döngü basladı")
        for (numara in baskaBirDizi) {
            println(numara / 5 + 3)
        }
        println("döngü  bitti")

        for (indeks in baskaBirDizi.indices){
            println(baskaBirDizi[indeks] / 5 + 3)
        }

        for (b in 0..9) {
            println(b)
        }

        val benimDigerStringDizim = ArrayList<String>()
        benimDigerStringDizim.add("Atıl")
        benimDigerStringDizim.add("Kaplan")

        for (str in benimDigerStringDizim) {
            println(str)

        benimDigerStringDizim.forEach {
            println(it)
        }

        }

//döngüler
        println("-------------------while döngüsü------------------")

        var j = 0
        while (j < 10) {
            println(j)
            j = j+1
        }





































    }

}

