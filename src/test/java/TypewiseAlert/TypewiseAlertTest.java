package TypewiseAlert;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TypewiseAlertTest {
    @Test
    public void infersBreachTooLow() {
        assertTrue(TypewiseAlert.inferBreach(12, 20, 30) ==
                BreachType.TOO_LOW);
    }

    @Test
    public void infersBreachTooHigh() {
        assertTrue(TypewiseAlert.inferBreach(35, 20, 30) ==
                BreachType.TOO_HIGH);
    }

    @Test
    public void infersBreachNormal() {
        assertTrue(TypewiseAlert.inferBreach(25, 20, 30) ==
                BreachType.NORMAL);
    }

    @Test
    public void checkNAlert_ToController_Passive_Cooling() {
        assertTrue(TypewiseAlert.checkAndAlert(AlertTarget.TO_CONTROLLER, CoolingType.PASSIVE_COOLING, 30));
    }

    @Test
    public void checkNAlert_ToController_HI_ACTIVE_COOLING() {
        assertTrue(TypewiseAlert.checkAndAlert(AlertTarget.TO_CONTROLLER, CoolingType.HI_ACTIVE_COOLING, 46));
    }

    @Test
    public void checkNAlert_ToController_MED_ACTIVE_COOLING() {
        assertTrue(TypewiseAlert.checkAndAlert(AlertTarget.TO_CONTROLLER, CoolingType.MED_ACTIVE_COOLING, 35));
    }

    @Test
    public void checkNAlert_ToEmail_Passive_Cooling() {
        assertTrue(TypewiseAlert.checkAndAlert(AlertTarget.TO_EMAIL, CoolingType.PASSIVE_COOLING, 30));
    }

    @Test
    public void checkNAlert_ToEmail_HI_ACTIVE_COOLING() {
        assertTrue(TypewiseAlert.checkAndAlert(AlertTarget.TO_EMAIL, CoolingType.HI_ACTIVE_COOLING, 46));
    }

    @Test
    public void checkNAlert_ToEmail_MED_ACTIVE_COOLING() {
        assertTrue(TypewiseAlert.checkAndAlert(AlertTarget.TO_EMAIL, CoolingType.MED_ACTIVE_COOLING, 35));
    }




}
