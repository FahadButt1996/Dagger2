package com.practice.dagger2.di.component

import com.practice.dagger2.model.Car
import com.practice.dagger2.activities.MainActivity
import com.practice.dagger2.di.module.WheelsModule
import dagger.Component

@Component (modules = [WheelsModule::class])
interface CarComponent{
    fun getCar() : Car
    fun inject(mainActivity : MainActivity)
}