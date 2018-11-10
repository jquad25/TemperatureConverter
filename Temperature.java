
/**
 * Description: Temperature stores a temperature
 * in Fahrenheit, Celsius, and Kelvin scales
 *
 * @author Ursula Jordan Aquadro
 * @version 1.0
 */
public class Temperature
{
    private double degreesFahrenheit; // Fahrenheit temperature
    private double degreesCelsius; // Celsius temperature
    private double degreesKelvin; // Kelvin temperature
    
/**
* This constructor for Temperature sets the temperature
* values to the value in degrees, based on type
* 
* @param type temperature scale to use
* @param degrees degrees Fahrenheit
* @throws InvalidTemperatureTypeException if type is not C, F, or K
*/
public Temperature(String type, double degrees)
    throws InvalidTemperatureTypeException, InvalidTemperatureException {
    if ( ! isTypeValid(type) )
        throw new InvalidTemperatureTypeException(type + " is not a valid type.");
    if (type.equalsIgnoreCase("C"))
        setDegreesCelsius(degrees);
    else if (type.equalsIgnoreCase("F"))
        setDegreesFahrenheit(degrees);
    else if (type.equalsIgnoreCase("K"))
        setDegreesKelvin(degrees);
    }

 
public static boolean isTypeValid(String temperatureType)  {
        if (temperatureType.equalsIgnoreCase("C") ||
                temperatureType.equalsIgnoreCase("F") ||
                temperatureType.equalsIgnoreCase("K"))
            return true;
        else
            return false;
}


public static boolean isTemperatureValid(String temperatureType, double temperature) {
        if ((temperatureType.equalsIgnoreCase("C") && temperature >= -273.15) ||
                (temperatureType.equalsIgnoreCase("F") && temperature >= -459.67) ||
                (temperatureType.equalsIgnoreCase("K") && temperature >= 0.0))
            return true;
        else
            return false;
}

/**
* The setDegreesFahrenheit method sets the Fahrenheit temperature
* 
* @param degrees The Fahrenheit value to store 
*/
public void setDegreesFahrenheit(double degrees) 
    throws InvalidTemperatureException {
        if (! isTemperatureValid("F", degrees))
            throw new InvalidTemperatureException(degrees + "is not a valid Farehneit value.");
            degreesFahrenheit = degrees; // set Fahrenheit value
            degreesCelsius = (degreesFahrenheit - 32.0) * 5.0 / 9.0; // set Celsius
            degreesKelvin = degreesCelsius + 273.15; // set Kelvin value
}
  
public void setDegreesCelsius(double degrees) 
    throws InvalidTemperatureException {
        if(! isTemperatureValid("C", degrees))
            throw new InvalidTemperatureException(degrees + "is not a valid Celsius value.");
            degreesCelsius = degrees;
            degreesFahrenheit = degreesCelsius * 9.0 / 5.0 + 32.0;
            degreesKelvin = degreesCelsius + 273.15;
}

public void setDegreesKelvin(double degrees) 
    throws InvalidTemperatureException {
        if(! isTemperatureValid("K", degrees))
            throw new InvalidTemperatureException(degrees + "is not a valid Kelvin value.");
    degreesKelvin = degrees;
    degreesCelsius = degreesKelvin - 273.15;
    degreesFahrenheit = degreesCelsius * 9.0 / 5.0 + 32.0;
}
 
    /**
* getDegreesCelsius retrieves the Celsius temperature value
* 
* @return a double value containing the Celsius temperature
*/
public double getDegreesCelsius() {
    return degreesCelsius;
}

/**
* getDegreesKelvin retrieves the Kelvin temperature value
* 
* @return a double value containing the Kelvin temperature
*/
public double getDegreesKelvin() {
    return degreesKelvin;
}

public double getDegreesFahrenheit() {
    return degreesFahrenheit;
}

}
