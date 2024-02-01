package phase2.strategy;

public interface ICar {
    void drive();

    void showColor();

    void setCarColor(ICarColor carColor);

    void setDriveStyle(IDriveStyle driveStyle);
}
