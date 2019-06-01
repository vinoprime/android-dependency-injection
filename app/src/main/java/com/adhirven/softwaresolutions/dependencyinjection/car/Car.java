package com.adhirven.softwaresolutions.dependencyinjection.car;

import android.util.Log;

import com.adhirven.softwaresolutions.dependencyinjection.Driver;
import com.adhirven.softwaresolutions.dependencyinjection.car.Engine;
import com.adhirven.softwaresolutions.dependencyinjection.car.Wheels;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";

    @Inject
    Engine engine;
    private Wheels wheels;
    private Driver driver;


    @Inject
    public Car(Driver driver, Engine engine, Wheels wheels) {
        this.driver = driver;
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListner(this);

    }

    public void drive() {
        engine.start();
        Log.d(TAG, driver + " Driving... " + this);
    }

}
