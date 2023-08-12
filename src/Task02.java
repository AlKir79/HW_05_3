import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        int [] myArr = new int[20];
        for (int i=0;i< myArr.length;i++){
            myArr[i] = (int) (Math.random()*40-10);
        }
        boolean isFirstNegative = false;
        int sum = 0;
        for (int i=0;i< myArr.length;i++){
            if (isFirstNegative) sum+=myArr[i];
            if (myArr[i]<0) isFirstNegative = true;
        }
        System.out.println(Arrays.toString(myArr));
        System.out.printf("Сумма элементов массива после первого отрицательного "+sum);
    }
}
