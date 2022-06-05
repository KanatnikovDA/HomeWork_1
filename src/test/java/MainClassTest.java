import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainClassTest {


    @Test
    public void testGetLocalNumber() {
        Assertions.assertEquals(14, MainClass.getLocalNumber(), "Ошибка: Метод 'getLocalNumber' вернул не '14'");
    }

    @Test
    public void  testGetClassNumber(){
        MainClass mainClass = new MainClass();
        Assertions.assertTrue(mainClass.getClass_number() >= 45, "Ошибка: getClass_number вернул число меньше 45");
    }
}
