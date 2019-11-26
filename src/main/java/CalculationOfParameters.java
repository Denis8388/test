public class CalculationOfParameters {
    public int calculation(int length, int width, int widthWallpaper, int height){
        int perimeter = (length*2)+(width*2);   //периметр
        int canvas = perimeter/widthWallpaper;  //количество полотнищ
        int rollLength = 10;    //Длина рулона
        int canvasOnRoll = rollLength/height;   // количество полос на стену от одного рулона
        int numberOfWallpapers = canvas/canvasOnRoll;   //Колтичество обоев
        return numberOfWallpapers;
    }

}
