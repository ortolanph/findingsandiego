package pho.findingsandiego.functional.finder;

public enum BuilderExceptionMessages {

    EXCEPTION_GENDER("Gender must not be null"),
    EXCEPTION_HAIR("Hair color must not be null");

    private String message;

    BuilderExceptionMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
