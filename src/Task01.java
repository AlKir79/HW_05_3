import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int size = in.nextInt();
        int [] myArr = new int[size];
        for (int i = 0; i<myArr.length;i++){
            myArr[i] = i*i;
        }
        System.out.println(Arrays.toString(myArr));
    }
}
