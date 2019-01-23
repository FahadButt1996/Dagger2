package com.practice.dagger2.model

import android.util.Log
import javax.inject.Inject

class Tires @Inject constructor() {

    fun tireType(){
        Log.d(" di Tire Class" , "Sports Tire")
    }
}