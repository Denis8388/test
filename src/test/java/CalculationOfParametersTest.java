import static org.junit.jupiter.api.Assertions.*;

class CalculationOfParametersTest {
    @org.junit.jupiter.api.Test
    void calculate() {
        int length = 5; //Длина комнаты
        int width = 6; //Ширина комнаты
        int widthWallpaper = 1; //Ширина обоев
        int height = 4; //Высота комнаты
        CalculationOfParameters data = new CalculationOfParameters();
        int result = data.calculation(length, width, widthWallpaper, height);
        assertEquals(11, result);
    }
}