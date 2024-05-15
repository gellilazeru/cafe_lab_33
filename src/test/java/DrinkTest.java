import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DrinkTest {

    private Drink drink;

    @BeforeEach
    public void setUp() {
        drink = new Drink("Hot Chocolate", "Hot", true, 3.5);
    }

   @Test
    public void canAddSpoonsOfSugar(){
        assertThat(drink.addSpoonsOfSugar(2)).isEqualTo(2);

   }
}
