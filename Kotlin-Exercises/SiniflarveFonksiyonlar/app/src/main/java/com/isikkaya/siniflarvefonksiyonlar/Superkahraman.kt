package com.isikkaya.siniflarvefonksiyonlar

class Superkahraman(var isim:String, var yas:Int, var meslek:String) {
//primary constructor


    private var sacininRengi = "Sarı"

    fun testFonksiyonu(){
        println("test")
    }
//getter
    fun sacRenginiAl() : String{
        return this.sacininRengi
    }
//setter
    /*
    fun sacRenginiDegistir() : String{
        return this.sacininRengi
    }
    */

    //access levels
    //private-protected-internal-public


/*
    //property
    var isim = ""
    var yas = 0
    var meslek = ""

//constructor (secondary constructor)
    constructor(isim: String, yas: Int, meslek: String){
    this.isim = isim
    this.yas = yas
    this.meslek = meslek
    println("constructor çağrıldı")


}
*/


}



