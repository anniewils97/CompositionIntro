import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import products.Product;
import vehicles.Kayak;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class KayakTest {

    Kayak kayak;

    @BeforeEach
    public void setUp(){
        kayak = new Kayak(100, 10,
        new Product(1000, 3, "The Jolly Mon"), "round bottom");
    }

    @Test
    public void canGetHullType(){
        assertThat(kayak.getHullType()).isEqualTo("round bottom");
    }

    @Test
    public void canSetHullType(){
        kayak.setHullType("flat bottom");
        assertThat(kayak.getHullType()).isEqualTo("flat bottom");
    }

}