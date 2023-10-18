import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import products.Product;
import vehicles.IMotorised;
import vehicles.Motor;
import vehicles.SpeedBoat;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SpeedBoatTest {

    SpeedBoat speedBoat;

    @BeforeEach
    public void setUp(){
        speedBoat = new SpeedBoat(1000, 300,
        new Product(50000, 3, "The Bright Light"),
        new Motor(600, 600) ,
        "flat bottom");
    }

    @Test
    public void canGetHp(){
        assertThat(speedBoat.getHp()).isEqualTo(600);
    }

    @Test
    public void canSetHp(){
        speedBoat.setHp(700);
        assertThat(speedBoat.getHp()).isEqualTo(700);
    }

    @Test
    public void canStartEngine(){
        assertThat(speedBoat.startEngine()).isEqualTo("motor started");
    }

    @Test
    public void canStopEngine(){
        assertThat(speedBoat.stopEngine()).isEqualTo("motor stopped");
    }

    @Test
    public void canGetFuel(){
        assertThat(speedBoat.getFuel()).isEqualTo(600);
    }

    @Test
    public void canSetFuel(){
        speedBoat.setFuel(700);
        assertThat(speedBoat.getFuel()).isEqualTo(700);
    }
    
    @Test
    public void canGetHullType(){
        assertThat(speedBoat.getHullType()).isEqualTo("flat bottom");
    }

    @Test
    public void canSetHullType(){
        speedBoat.setHullType("round bottom");
        assertThat(speedBoat.getHullType()).isEqualTo("round bottom");
    }

}
