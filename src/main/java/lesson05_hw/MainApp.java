package lesson05_hw;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {
        AppData appData = new AppData();

        String file = "src/main/java/lesson05_hw/text.csv";
        appData.setHeader(new String[]{"Value 1","Value 2","Value 3"});
        appData.setData(new Integer[][]{{100,200,123},{300,400,500}});

        appData.save(file);
        appData.load(file);
        appData.setData(new Integer[][]{{333,321,32123},{31,54,55}});
        appData.save(file);
        appData.load(file);

    }
}
