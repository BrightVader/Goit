package Modul4.TemperatureConverter;

/**
 * Created by XXX on 06.01.2016.
 */
public class TemperatureConverter {


    public double convertTtemperature(double degree, char convertTo){

        if (convertTo == 'F'){

            return degree*5/9 + 32;
        }
        else if (convertTo == 'C'){

            return (degree -32)*5/9;

        }



    }




}
