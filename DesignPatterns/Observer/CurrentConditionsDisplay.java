package DesignPatterns.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    
    private float temprature;
    private float humidity;
    private Subject weatherData;
    
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temprature, float humidity, float pressure) {
        this.temprature = temprature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: "+temprature+"F degree and "+humidity+ "% humidity");
    }

    
}
