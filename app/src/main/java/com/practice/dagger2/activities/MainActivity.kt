package com.practice.dagger2.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.practice.dagger2.R
import com.practice.dagger2.di.component.CarComponent
import com.practice.dagger2.di.component.DaggerCarComponent
import com.practice.dagger2.model.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent: CarComponent = DaggerCarComponent.create()
        // for feild injection
        carComponent.inject(this)

        // for constructor injection
        // car = carComponent.getCar()
        car.driveCar()
    }
}
