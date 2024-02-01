package phase2.strategy;

public class Ferrari implements ICar {
    private IDriveStyle driveStyle;
    private ICarColor carColor;

public Ferrari(IDriveStyle driveStyle, ICarColor color) {
        this.driveStyle = driveStyle;
        this.carColor = color;
    }

    @Override
    public void drive() {
        driveStyle.driveInStyle();
    }

    @Override
    public void showColor() {
        carColor.shine();
    }

    public void setDriveStyle(IDriveStyle style) {
        this.driveStyle = style;
    }

    public void setCarColor(ICarColor color) {
        this.carColor = color;
    }
}
