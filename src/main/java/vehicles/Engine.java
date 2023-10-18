package vehicles;

public class Engine implements IMotorised {
    private int fuel;
    private int hp;
    private boolean motorOn;

    public Engine(int fuel, int hp) {
        this.fuel = fuel;
        this.hp = hp;
    }

    @Override
    public int getFuel() {
        return fuel;
    }

    @Override
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    public String startEngine() {
        System.out.println("engine started");
        return "engine started";
    }

    public String stopEngine() {
        System.out.println("engine stopped");
        return "engine stopped";
    }

    public boolean getMotorOn() {
        return this.motorOn;
    }

    public void setMotorOn(boolean motorOn) {
        this.motorOn = motorOn;
    }
}

