import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {
        int [] myArr = new int[200];
        for (int i=0;i< myArr.length;i++){
            myArr[i] = (int) (Math.random()*200);
        }
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (int i = 0;i< myArr.length;i++){
            if(myArr[i]/100>0) sum3++;
            else if (myArr[i]/10>0) sum2++;
            else sum1++;
        }
        System.out.println(Arrays.toString(myArr));
        System.out.println("digits3 = "+sum3);
        System.out.println("digits2 = "+sum2);
        System.out.println("digits1 = "+sum1);
    }
}
