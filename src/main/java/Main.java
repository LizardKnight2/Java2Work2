//1.Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, при подаче массива
// другого размера необходимо бросить исключение MyArraySizeException.
//2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
// Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
// должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
//3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException,
// и вывести результат расчета.


import java.lang.reflect.Array;

public class Main {


    public static void main(String[] args) {
        String[][] twoArray = {
                {"1 ", "1 ", "1 ", "1 "},
                {"2 ", "2 ", "2 ", "2 "},
                {"3 ", "3 ", "3 ", "3 "},
                {"4 ", "4 ", "4 ", "4 "}
        };


        try {

            throw new MyArraySizeException("s");


        } catch (MyArraySizeException e) {
            System.out.println("Hola");


        }

    }
    public static void S(String twoArray[][]){
        try {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    int a = 0;
                    a = a + Integer.parseInt(twoArray[i][j]);
                    throw new MyArrayDataException("c");
                }
            }
        } catch (MyArrayDataException e) {
            System.out.println("Amigo");



        }

    }
}
