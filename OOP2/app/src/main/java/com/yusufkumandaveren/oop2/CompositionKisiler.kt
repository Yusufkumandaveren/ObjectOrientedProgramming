package com.yusufkumandaveren.oop2

fun main(){
    val adres = Adres("Bitlis","Tatvan")
    var kisi = Kisiler1("Yusuf",22, adres)
    println("Kisinin ismi: ${kisi.ad}")
    println("Yasi: ${kisi.yas}")
    println("Adresi: ${kisi.adres.il} / ${kisi.adres.ilce}")
}