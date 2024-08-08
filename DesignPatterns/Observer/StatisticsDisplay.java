package DesignPatterns.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    
    private float temprature;
    private float humidity;
    private Subject weatherData;
    
    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temprature, float humidity, float pressure) {
        this.temprature = temprature;
        this.humidity = humidity;
    }

    public void display() {
        System.out.println("Statistics: "+temprature+"F degree and "+humidity+ "% humidity");
    }

    
}
