package com.yusufkumandaveren.oop2

fun main(){

    val topkapiSarayi = Saray(20,5)
    val bogazVilla = Villa(true,4)

    println("Topkapi Sarayinin pencere sayisi: ${topkapiSarayi.pencereSayisi} ")
    println("Topkapi Sarayinin kule sayisi: ${topkapiSarayi.kuleSayisi} ")
    println("Bogazdaki villanın pencere sayisi: ${bogazVilla.pencereSayisi} ")
    println("Bogazdaki villada garaj var mı ?: ${bogazVilla.garajVarMi} ")

    val ev = Ev(5)
    println("Evin penceere sayisi: ${ev.pencereSayisi}")// üst sınıf olduğu için alt sınıfların özellilerine erişemez.

}