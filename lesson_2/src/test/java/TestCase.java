import ua.kpi.lesson_2.*;
import org.junit.Test;
import static junit.framework.Assert.*;

public class TestCase {
    GameModel model;

    @Test
    public void testSecretRand() {
        model = new GameModel();
        int secret = model.getSecretRand();
        assertEquals(model.getSecretRand(), secret);
    }

}
