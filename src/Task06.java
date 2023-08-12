import java.util.Date;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int size = in.nextInt();
        int [][] myArr = new int[size][size];
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                myArr[i][j] = (int) (Math.random()*89+10);
            }
        }
        printArr(myArr,size);
        long startTime = new Date().getTime();
        int max = findMax(myArr,size);
        System.out.println(max);
        long endTime = new Date().getTime();
        System.out.println("Время выполнения "+(endTime-startTime)+" мс");
        printCoord(myArr,size,max);
    }
    static void printArr(int myArr[][],int size){
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                System.out.print(myArr[i][j]+" ");
            }
            System.out.println();
        }
}
static int findMax(int myArr[][], int size){
        int max = 0;
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                if (myArr[i][j]>max) max = myArr[i][j];
            }
        }
        return max;
}
    static void printCoord(int myArr[][],int size, int val){
        System.out.println("Значение "+val+" расположено по координатам:");
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                if (myArr[i][j]==val) System.out.println(i+" "+j);
            }
        }
    }

}
