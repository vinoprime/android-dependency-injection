package com.adhirven.softwaresolutions.dependencyinjection;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;

    private String da;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive() {
        Log.d(TAG,"Driving");
    }


    public String getDa() {
        return da;
    }

    public void setDa(String da) {
        this.da = da;
    }
}
