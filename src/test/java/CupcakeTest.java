import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CupcakeTest {

    private Cupcake cupcake;
    private Cupcake cupcake2;

    @BeforeEach
    public void setUp(){
        cupcake = new Cupcake("Cherry Blossom", "Cherry", false, 5);
        cupcake2 = new Cupcake("Chocolate Scrumptious", "Chocolate", true, 6);
    }

    @Test
    public void canAddToppings(){
        assertThat(cupcake2.addToppings("chocolate")).isEqualTo("Add chocolate sprinkles.");
    }

    @Test
    public void canCheckIfVegan(){
        assertThat(cupcake.isVegan(true)).isEqualTo("This cupcake contains dairy");
    }

    @Test
    public void canCheckIfNotVegan(){
        assertThat(cupcake2.isVegan(false)).isEqualTo("This cupcake does not contain dairy");
    }



}
