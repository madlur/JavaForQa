package lesson07_hw;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponseArray {
    private List<DailyForecast> dailyForecasts;

    @JsonSetter("DailyForecasts")
    public void getDailyForecasts(List<DailyForecast> values) {
        this.dailyForecasts = values;
    }

    @JsonGetter("DailyForecasts")
    public List<DailyForecast> getDailyForecasts() {
        return this.dailyForecasts;
    }

    public WeatherResponseArray() {
    }
}
