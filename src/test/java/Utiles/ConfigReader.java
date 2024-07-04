package Utiles;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

        Properties prop;
        public ConfigReader(){}
        public Properties ConfigurationManager() {
            this.prop = new Properties();
            File proFile = new File("src/test/resources/Configs/ConfigFile.properties");

            try {
                FileInputStream fis = new FileInputStream(proFile);
                this.prop.load(fis);
            } catch (Throwable var3) {
                var3.printStackTrace();
            }
            return this.prop;

        }

        public String getbrowsername(){
            String Browsername= this.prop.getProperty("Browsername");
            return Browsername;
        }
        public  String geturl(){
            String url= this.prop.getProperty("url");
            return url;
        }
        public String getusername(){
            String username= this.prop.getProperty("username");
            return username;
        }
        public String getpassword(){
            String password=this.prop.getProperty("password");
            return  password;
        }



}

