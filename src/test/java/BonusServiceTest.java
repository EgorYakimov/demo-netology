import org.junit.jupiter.api.Test;
import ru.netology.unit.BonusService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {

    @Test
    void calculateBonus() {
        //prepare data
        BonusService service = new BonusService();
        int amount = 2000;

        //action
        int actual = service.calculateBonus(amount);
        int expected = 10;

        //check result
        assertEquals(expected, actual);
    }
}
