package com.adhirven.softwaresolutions.dependencyinjection.dagger;

import com.adhirven.softwaresolutions.dependencyinjection.car.DieselEngine;
import com.adhirven.softwaresolutions.dependencyinjection.car.Engine;


import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}
