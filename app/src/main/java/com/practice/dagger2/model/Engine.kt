package com.practice.dagger2.model

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor(){

    fun engineWorking(){
        Log.d(" di Engine Class"  , "Engine Started")
    }

}
