package TypewiseAlert;

public class TypewiseAlert {

    public static BreachType inferBreach(double value, double lowerLimit, double upperLimit) {
        if (value < lowerLimit) {
            return BreachType.TOO_LOW;
        }
        if (value > upperLimit) {
            return BreachType.TOO_HIGH;
        }
        return BreachType.NORMAL;
    }

    public static boolean checkAndAlert(
            AlertTarget alertTarget, CoolingType coolingType, double temperatureInC) {

        BreachType breachType = inferBreach(
                temperatureInC, coolingType.getLowerLt(), coolingType.getUpperLt());

        return alertForBreach(alertTarget, breachType);
    }

    private static boolean alertForBreach(AlertTarget alertTarget, BreachType breachType) {

        switch (alertTarget) {
            case TO_CONTROLLER:
                return sendToController(breachType);
            case TO_EMAIL:
                return  sendToEmail(breachType.getMsg());
        }
        return false;
    }

    public static boolean sendToController(BreachType breachType) {
        int header = 0xfeed;
        System.out.println(header +":"+ breachType);
        return true;
    }

    public static boolean sendToEmail(String message) {
        String recipient = "a.b@c.com";
        System.out.println("To: "+ recipient);
        System.out.println(message);
        return true;
    }
}
