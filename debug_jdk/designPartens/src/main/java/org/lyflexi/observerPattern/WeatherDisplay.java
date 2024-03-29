package org.lyflexi.observerPattern;

/**
 * @Author: ly
 * @Date: 2024/3/13 17:46
 */

public class WeatherDisplay implements Observer {
    private Subject subject;
    private float temperature;//温度
    private float humidity;//湿度
    private float pressure;//气压

    public WeatherDisplay(Subject subject) {//注册监听对象
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public void display(){
        System.out.println("当前最新的温度为：" + temperature + ",湿度为：" + humidity +
                ",气压为：" + pressure);
    }
}

