package com.adhirven.softwaresolutions.dependencyinjection.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class DieselEngine implements Engine {

    private static final String TAG = "DieselEngine";

    private int horsePower;
    private int engineCapacity;

    @Inject
    public DieselEngine(@Named("horse power") int horsePower, @Named("engine capacity") int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }


    @Override
    public void start() {
        Log.d(TAG, "DieselEngine started" +
                "\nHorsePower : " + horsePower +
                "\nEngineCapacity : " + engineCapacity);
    }
}
