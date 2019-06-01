package com.adhirven.softwaresolutions.dependencyinjection.dagger;

import com.adhirven.softwaresolutions.dependencyinjection.car.Engine;
import com.adhirven.softwaresolutions.dependencyinjection.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
