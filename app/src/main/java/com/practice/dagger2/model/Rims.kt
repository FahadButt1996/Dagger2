package com.practice.dagger2.model

import android.util.Log
import javax.inject.Inject

class Rims @Inject constructor(){

    fun rimStyle(){
        Log.d(" di Rims class" , "Alloy Rims")
    }
}