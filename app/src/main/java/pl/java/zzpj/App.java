package pl.java.zzpj;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class App 
{
    public static void main( String[] args )
    {
        Person p = new Person();
        p.setName(getPersonNameProperty());
        System.out.println(p.sayHi());
    }

    public static String getPersonNameProperty() {
        Properties properties = new Properties();
        String propertiesFileName = "config.properties";
        InputStream inputStream = App.class.getClassLoader().getResourceAsStream(propertiesFileName);
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty("personName");
    }
}
