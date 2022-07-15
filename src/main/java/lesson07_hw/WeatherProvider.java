package lesson07_hw;

import java.io.IOException;
import java.sql.SQLException;

public interface WeatherProvider {

    void getWeather(Periods periods, DatabaseRepository dbRepo) throws IOException, SQLException;
    void getWeather(Periods periods) throws IOException;

}
