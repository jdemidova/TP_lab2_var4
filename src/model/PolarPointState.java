package model;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PolarPointState {
    private double radius;
    private int angle;

    public PolarPointState() {
        this(1.0, 0);
    }

    public PolarPointState(double radius, int angle) {
        this.radius = radius;
        this.angle = angle;
    }

    public double getRadiusState() {
        return radius;
    }

    public int getAngleState() {
        return angle;
    }

    public void setRadiusState(double r) {
        this.radius = r;
    }

    public void setAngleState(int a) {
        this.angle = a;
    }

    public void setState(double r, int a) {
        this.angle = a;
        this.radius = r;
    }

    public void rotation(int angle_dif) {
        this.angle += angle_dif;
        while (this.angle > 360) {
            this.angle %= 360;
        }
        while (this.angle < 0) {
            this.angle += 360;
        }
    }

    public void multiplication(double k) {
        if (k > 0) {
            this.radius *= k;
        }
    }
}
