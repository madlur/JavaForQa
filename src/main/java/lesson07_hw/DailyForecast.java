package lesson07_hw;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonIgnoreProperties(ignoreUnknown=true)
public class DailyForecast {
    private String date;
    private Temperature5Days temperature;
    private DayNight day;
    private DayNight night;

    @JsonSetter("Date")
    public void setDate(String value) {
        this.date = value;
    }

    // Вычисляемое свойство...
    @JsonGetter("Date")
    public String getDate() {
        String[] dtParts = this.date.split("T");
        return dtParts[0];
    }

    @JsonSetter("Temperature")
    public void setTemperature(Temperature5Days value) {
        this.temperature = value;
    }

    @JsonGetter("Temperature")
    public Temperature5Days getTemperature() {
        return this.temperature;
    }

    @JsonSetter("Day")
    public void setDay(DayNight value) {
        this.day = value;
    }

    @JsonGetter("Day")
    public DayNight getDay() {
        return this.day;
    }

    @JsonSetter("Night")
    public void setNight(DayNight value) {
        this.night = value;
    }

    @JsonGetter("Night")
    public DayNight getNight() {
        return this.night;
    }

    public DailyForecast() {}
}