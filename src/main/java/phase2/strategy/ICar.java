package phase2.strategy;

public abstract class ICar {
    protected IDriveStyle driveStyle;
    protected ICarColor carColor;

    void drive() {
        driveStyle.driveInStyle();
    }

    void showColor() {
        carColor.shine();
    }

    void setCarColor(ICarColor carColor) {
        this.carColor = carColor;
    }

    void setDriveStyle(IDriveStyle driveStyle) {
        this.driveStyle = driveStyle;
    }
}
