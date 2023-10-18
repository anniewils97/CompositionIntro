
package vehicles;

public class Motor implements IMotorised {
    private int fuel;
    private int hp;


    public Motor(int fuel, int hp) {
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

//    public void startEngine() {
//        System.out.println("motor started");
//         this.motorOn=true;
//        return "motor started";
//    }
    
    @Override
    public String startEngine() {
        System.out.println("motor started");
//          this.motorOn=true;
        return "motor started";
    }

    public String stopEngine() {
        System.out.println("motor stopped");
//         this.motorOn=false;
        return "motor stopped";
    }
    
}

