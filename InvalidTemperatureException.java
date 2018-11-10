
/**
 * InvalidTemperatureException is an exception that
 * gets thrown if the user tries to store a
 * temperature below absolute zero.
 *
 * @author Ursula Jordan Aquadro
 * @version v1.0
 */
public class InvalidTemperatureException extends Exception {
    /** Default constructor for InvalidTemperatureException objects.
     * It creates an InvalidTemperatureException with a null detail
     * message.
     */
    public InvalidTemperatureException() {
        super();
    }

    /**Constructor for InvalidTemperatureException objects.
     * It creates an InvalidTemperatureException object with the
     * specified detail message.
     */
    public InvalidTemperatureException(String message){
        super(message);
    }
}
