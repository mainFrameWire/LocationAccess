package com.example.displaylocation

import androidx.appcompat.app.AppCompatActivity

class GetLocation(param: Any?, longitude: Double) : AppCompatActivity() {

    private var Longitude: Double = 0.0
    private var Latitude: Double = 0.0


    fun GetLocation(longitudee: Double, latitudee: Double){
        Longitude = longitudee
        Latitude = latitudee
    }



}