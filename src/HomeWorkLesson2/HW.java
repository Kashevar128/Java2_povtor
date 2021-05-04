package HomeWorkLesson2;

import java.util.Arrays;

public class HW {
    private final static int size = 4;

    private static void createMyArraySizeException() throws MyArraySizeException {
        throw new MyArraySizeException("Размер массива должен быть " + size + "x" + size);
    }

    public static int adder(String[][] str) throws MyArraySizeException, MyArrayDataExeption {
        if (str.length != size) {
            createMyArraySizeException();
        } else {
            for (String[] strings : str) {
                if (strings.length != size) {
                    createMyArraySizeException();
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                try {
                    sum += Integer.parseInt(str[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataExeption("Содержание ячейки " + i + " " + j +
                            " не подходит для преобразования в число.");
                }
            }
        }
        showRes(str, sum);
        return sum;
    }

    private static void showRes(String[][]strA, int sum) {
        for (String[] s : strA) {
            System.out.println(Arrays.toString(s));
        }
        System.out.println("Сумма элементов: " + sum);
    }



    public static void main(String[] args) {
        String[][] arrStr1 = new String[4][4];
        String[][] arrStr2 = {{"1", "3", "5", "6"},
                {"2", "4", "4", "10"},
                {"4", "двадцать", "15", "30"},
                {"ноль", "4", "7", "9"}};
        String[][] arrStr3 = {{"1", "3", "5", "6"},
                {"2", "4", "4", "10"},
                {"4", "20", "15", "30"},
                {"0", "4", "7", "9"}};
        try {
            adder(arrStr3);
        } catch (MyArraySizeException | MyArrayDataExeption e) {
            e.printStackTrace();
        }

    }
}
