package phase2.strategy;

public class Bently implements ICar {

    private IDriveStyle driveStyle;
    private ICarColor carColor;

    public Bently(IDriveStyle style, ICarColor color) {
        this.driveStyle = style;
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

    public void setDriveStyle(IDriveStyle driveStyle) {
        this.driveStyle = driveStyle;
    }

    public void setCarColor(ICarColor carColor) {
        this.carColor = carColor;
    }
    
}
