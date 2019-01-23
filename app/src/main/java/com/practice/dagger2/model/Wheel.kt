package com.practice.dagger2.model

import android.util.Log
import javax.inject.Inject

class Wheel @Inject constructor(rims: Rims, tires : Tires){

    var _rims : Rims = rims
    var _tires: Tires = tires

    fun wheelStartMoving(){
        Log.d(" di Wheels class" , "Wheels start Moving")
    }
}