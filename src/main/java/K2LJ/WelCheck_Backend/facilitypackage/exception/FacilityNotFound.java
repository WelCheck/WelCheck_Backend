package K2LJ.WelCheck_Backend.facilitypackage.exception;

/*
 * status -> 404
 */

public class FacilityNotFound extends WelCheckException{

    private static final String MESSAGE = "존재하지 않는 시설입니다.";

    public FacilityNotFound() {
        super(MESSAGE);
    }


    @Override
    public int statusCode() {
        return 404;
    }
}
