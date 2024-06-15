package K2LJ.WelCheck_Backend.facilitypackage.exception;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public abstract class WelCheckException extends RuntimeException {

    public final Map<String, String> validation = new HashMap<>();

    public WelCheckException(String message) {
        super(message);
    }

    public WelCheckException(String message, Throwable cause) {
        super(message, cause);
    }

    public abstract int statusCode();

    public void addValidation(String fieldName, String message) {
        validation.put(fieldName, message);
    }
}
