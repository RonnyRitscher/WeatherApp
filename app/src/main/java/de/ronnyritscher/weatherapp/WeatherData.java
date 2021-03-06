package de.ronnyritscher.weatherapp;

class WeatherData {
    private static final String TAG = WeatherData.class.getSimpleName();

    public String description;
    public double temp;
    public String name;
    public String icon;

    public WeatherData(String name, String description, String icon, Double temp) {
        this.name = name;
        this.description = description;
        this.icon = icon;
        this.temp = temp;
    }
}