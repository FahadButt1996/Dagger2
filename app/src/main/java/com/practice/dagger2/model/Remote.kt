package com.practice.dagger2.model

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor(){

    fun setListener(car : Car) {
        Log.d(" di Remote class" , "Remote Connected")
    }
}