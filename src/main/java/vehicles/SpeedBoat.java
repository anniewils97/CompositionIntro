package vehicles;

import products.IProduct;

public class SpeedBoat extends Vehicle implements IWaterVehicle, IMotorised{

    private String hullType;
    private IMotorised motor;



    public SpeedBoat(float weight, int maxSpeed, IProduct baseProduct, IMotorised motor,  String hullType) {
        super(weight, maxSpeed, baseProduct);
        this.hullType = hullType;
        this.motor = motor;
    }

//    @Override
//    public void startEngine() {
//        this.motor.startEngine();
//    }

    @Override
    public String startEngine() {
        return this.motor.startEngine();
    }

    @Override
    public String stopEngine() {
        return this.motor.stopEngine();

    }

    @Override
    public int getHp() {
        return this.motor.getHp();
    }

    @Override
    public void setHp(int hp) {
        this.motor.setHp(hp);
    }

    @Override
    public int getFuel() {
        return this.motor.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        this.motor.setFuel(fuel);
    }

    @Override
    public String getHullType() {
        return this.hullType;
    }

    @Override
    public void setHullType(String hullType) {
        this.hullType = hullType;
    }

}
