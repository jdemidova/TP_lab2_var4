package model;

public enum OperatorEnum {
    OPERATOR_ROTATION, OPERATOR_MULTIPLICATION, OPERATOR_UNKNOWN;
    public static final String ERROR_UNKNOWN_OPERATOR = "Error! Unexpected operator!";

    public PolarPointState process(double current_radius, int current_angle, double k, int angle_dif) {
        PolarPointState point = new PolarPointState(current_radius, current_angle);
        switch (this) {
            case OPERATOR_ROTATION:
                point.rotation(angle_dif);
                return point;
            case OPERATOR_MULTIPLICATION:
                point.multiplication(k);
                return point;
        }
        throw new RuntimeException(ERROR_UNKNOWN_OPERATOR);
    }
}
