package TypewiseAlert;

public enum CoolingType {

    PASSIVE_COOLING(0,35),
    HI_ACTIVE_COOLING(0,45),
    MED_ACTIVE_COOLING(0,40);

    private  int lowerLt;
    private int upperLt;

    CoolingType(int lowerLimit, int upperLimit) {
        lowerLt = lowerLimit;
        upperLt=upperLimit;
    }

    public int getLowerLt() {
        return lowerLt;
    }

    public int getUpperLt() {
        return upperLt;
    }
};
