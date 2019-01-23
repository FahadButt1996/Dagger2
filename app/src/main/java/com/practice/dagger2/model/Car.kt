package com.practice.dagger2.model

import android.util.Log
import javax.inject.Inject

//first constructor is injected
//then feilds
//then methods


// constructor injection
class Car @Inject constructor(wheels: Wheel) {
    @Inject
    lateinit var _engine: Engine
    var _wheel: Wheel = wheels

    fun driveCar() {

        Log.d(" di Car Class", "!!!!!!!! Drive Function !!!!!!!!!!")

        _wheel._rims.rimStyle()
        _wheel._tires.tireType()
        _wheel.wheelStartMoving()
        Log.d(" di Car Class", "!!***** Drive Function ends !!******")
    }

    @Inject
    fun enableRemote(remote: Remote) {
        Log.d(" di method", "!!!!! enable remote starts !!!!!!")

        _wheel.wheelStartMoving()
        _engine.engineWorking()
        remote.setListener(this)
        Log.d(" di method", "!!!****** enable remote ends !!!*****")

    }
}
