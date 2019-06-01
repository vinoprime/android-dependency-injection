package com.adhirven.softwaresolutions.dependencyinjection.dagger;


import com.adhirven.softwaresolutions.dependencyinjection.car.Rims;
import com.adhirven.softwaresolutions.dependencyinjection.car.Tires;
import com.adhirven.softwaresolutions.dependencyinjection.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule {

    private static final String TAG = "WheelsModule";

    @Provides
    static Rims provideRims(){
        return new Rims();
    }


    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflat();
        return tires;
    }


    @Provides
    static Wheels provideWheels(Rims rims,Tires tires){
        return new Wheels(rims,tires);

    }

}
