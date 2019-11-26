public class Main {
    public static void main(String[] args) {
        int length = 5; //Длина комнаты
        int width = 6; //Ширина комнаты
        int widthWallpaper = 1; //Ширина обоев
        int height = 4; //Высота комнаты
        CalculationOfParameters data = new CalculationOfParameters();
        int result = data.calculation(length, width, widthWallpaper, height);
        System.out.println(result);
    }
}
