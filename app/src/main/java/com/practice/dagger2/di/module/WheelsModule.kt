package com.practice.dagger2.di.module

import com.practice.dagger2.model.Rims
import com.practice.dagger2.model.Tires
import com.practice.dagger2.model.Wheel
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Module
    companion object {

        @JvmStatic
        @Provides
        fun provideRims(): Rims {
            return Rims()
        }

        @JvmStatic
        @Provides
        fun provideTires(): Tires {
            var tire = Tires()
            tire.tireType()
            return tire
        }

        @JvmStatic
        @Provides
        fun provideWheel(rims: Rims, tires: Tires): Wheel {
            return Wheel(rims, tires)
        }
    }
}