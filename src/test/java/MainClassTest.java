import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainClassTest {


    @Test
    public void testGetLocalNumber() {
        Assertions.assertEquals(14, MainClass.getLocalNumber(), "Ошибка: Метод 'getLocalNumber' вернул не '14'");
    }
}
