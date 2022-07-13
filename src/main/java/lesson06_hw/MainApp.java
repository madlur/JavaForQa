package lesson06_hw;

import okhttp3.*;

import java.io.IOException;

public class MainApp {
    public static void main(String[] args) throws IOException {
        OkHttpClient okHttpClient1 = new OkHttpClient();
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("https")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("5day")
                .addPathSegment("295212")
                .addQueryParameter("apikey", "uRxaesOxmg86Hw7d4so5p83oqbGd8qvy")
                .addQueryParameter("language", "ru")
                .addQueryParameter("details", "true")
                .addQueryParameter("metric", "true")
                .build();

        Request request = new Request.Builder()
                .url(httpUrl)
                .addHeader("Content-Type", "application/json")
                .build();

        Response response = okHttpClient1.newCall(request).execute();

        System.out.println(response.isSuccessful());
        System.out.println(response.code());
        System.out.println(response.headers());
        System.out.println(response.body().string());
    }
}
