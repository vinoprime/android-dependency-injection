package com.adhirven.softwaresolutions.dependencyinjection.dagger;


import com.adhirven.softwaresolutions.dependencyinjection.MainActivity;
import com.adhirven.softwaresolutions.dependencyinjection.car.Car;
import com.adhirven.softwaresolutions.dependencyinjection.car.DieselEngine;
import com.adhirven.softwaresolutions.dependencyinjection.dagger.PetrolEngineModule;
import com.adhirven.softwaresolutions.dependencyinjection.dagger.WheelsModule;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        CarComponent build();
    }
}
