package phase2.strategy;

public class Run {
    public static void main(String[] args) {
        CarSimulator carSimulator = new CarSimulator();

        ICar ferrari = new Ferrari(null, null);
        ferrari.setCarColor(new MattBlack());
        ferrari.setDriveStyle(new DriveFast());
        
        ICar bently = new Bently(null, null);
        bently.setCarColor(new GlossyRed());
        bently.setDriveStyle(new GlamorousDrive());

        carSimulator.addCar(ferrari); 
        carSimulator.addCar(bently);

        carSimulator.simulate();
    }
}
