package TypewiseAlert;

public enum BreachType {
    NORMAL(""),
    TOO_LOW("Hi, the temperature is too low"),
    TOO_HIGH("Hi, the temperature is too high");

    private String msg;

    BreachType(String message) {
        msg = message;
    }

    public String getMsg() {
        return msg;
    }
};
