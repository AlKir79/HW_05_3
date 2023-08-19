import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int size = in.nextInt();
        int[][] myArr = new int[size][size];
        // заполняем массив
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                myArr[i][j] = (i*size+j+1)*((i+1)%2)+(i * size - j+size)*(i%2);
            }
        }
        printArr(myArr,size);
    }

    static void printArr(int myArr[][], int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf(" %2d",myArr[i][j]);
            }
            System.out.println();
        }

    }
}
