package ro.pub.cs.systems.eim.practicaltest02.model;

public class ValutaInformation {
    private String rate;

    public ValutaInformation() {
        this.rate = null;
    }

    public ValutaInformation(String rate) {
        this.rate = rate;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "WeatherForecastInformation{" +
                "rate='" + rate + '\'' +
                '}';
    }
}
