package com.adhirven.softwaresolutions.dependencyinjection;

import android.app.Application;

import com.adhirven.softwaresolutions.dependencyinjection.dagger.CarComponent;
import com.adhirven.softwaresolutions.dependencyinjection.dagger.DaggerCarComponent;


public class DependencyInjection extends Application {


    private static final String TAG = "DependencyInjection";

    private CarComponent carComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        carComponent = DaggerCarComponent
                .builder()
                .engineCapacity(1500)
                .horsePower(100).build();
    }


    public CarComponent getAppComponent(){
        return carComponent;
    }
}
