import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int size = in.nextInt();
        int[][] myArr = new int[size][size];
        // заполняем массив
        int i = 0; // строки
        int j = 0; // столбцы
        int border1 = size-1;
        int border2 = 0;
        int num = 1;
        while (num<size*size){
            while (j<border1){
                myArr[i][j] = num++;
                j++;
            }
            while (i<border1){
                myArr[i][j] = num++;
                i++;
            }
            while (j>border2){
                myArr[i][j] = num++;
                j--;
            }
// переопределяем границы
            border1--;
            border2++;

            while (i>border2){
                myArr[i][j] = num++;
                i--;
            }
        }
        if (num==size*size){
            myArr[i][j]=num++;
        }
        printArr(myArr,size);

    }
    static void printArr(int myArr[][], int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf(" %2d", myArr[i][j]);
            }
            System.out.println();
        }
    }
}
