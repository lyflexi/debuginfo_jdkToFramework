package org.lyflexi.observerPattern;

/**
 * @Author: ly
 * @Date: 2024/3/13 17:46
 */

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;

    private float temperature;//温度
    private float humidity;//湿度
    private float pressure;//气压

    public void setMessurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyObservers();//气温信息发生变化时，通知所有观察者
    }

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    /**
     * 注册观察者
     * @param o
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * 移除观察者
     * @param o
     */
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(i);
        }

    }

    /**
     * 通知所有观察者
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(temperature,humidity,pressure);
        }
    }
}

