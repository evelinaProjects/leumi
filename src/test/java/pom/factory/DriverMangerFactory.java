package pom.factory;


public class DriverMangerFactory {

    public static DriverManger getManager(){
        return new ChromeDriverManger();
    }

}
