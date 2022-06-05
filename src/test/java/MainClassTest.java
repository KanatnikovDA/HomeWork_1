import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainClassTest {


    @Test
    public void testGetLocalNumber() {
        Assertions.assertEquals(14, MainClass.getLocalNumber(), "Ошибка: Метод 'getLocalNumber' вернул не '14'");
    }

    @Test
    public void testGetClassNumber() {
        MainClass mainClass = new MainClass();
        Assertions.assertTrue(mainClass.getClass_number() > 45, "Ошибка: getClass_number вернул число меньше либо равное 45");
    }

    @Test
    public void testGetClassString() {
        MainClass mainClass = new MainClass();
        String expectedString = mainClass.getClass_string();
        Assertions.assertTrue(expectedString.contains("hello") || expectedString.contains("Hello"),
                "Строка 'Class_string' не содержит в себе hello'");
    }
}
