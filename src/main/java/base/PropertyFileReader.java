package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileReader {
    Properties properties = new Properties();
    InputStream input = null;

    public String getPropertyValue(String propertyName){
        try {
            input = new FileInputStream("config.properties");
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(input != null){
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return properties.getProperty(propertyName);
    }

}
