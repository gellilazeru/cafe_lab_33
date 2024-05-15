import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.awt.Color.white;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BrownieTest {

    private Brownie brownie;

    @BeforeEach
    public void setUp(){
        brownie = new Brownie("Nutella Brownie", 5, 3.4);

    }

    @Test
    public void canAddChocFilling(){
        assertThat(brownie.addChocFilling("white")).isEqualTo("Please add white chocolate filling.");
    }


}
