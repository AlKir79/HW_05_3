import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        int [] myArr1 = new int[100];
        int [] myArr2 = new int[100];
        for (int i=0;i< myArr1.length;i++){
            myArr1[i] = (int) (Math.random()*855-300);
        }
        int count = 0;
        for (int i=0;i<myArr1.length;i++){
            if (myArr1[i]>0) {myArr2[count] = myArr1[i];count ++;}
        }
        for (int i=0;i<myArr1.length;i++){
            if (myArr1[i]==0) {myArr2[count] = myArr1[i];count ++;}
        }
        for (int i=0;i<myArr1.length;i++){
            if (myArr1[i]<0) {myArr2[count] = myArr1[i];count ++;}
        }
        System.out.println(Arrays.toString(myArr1));
        System.out.println(Arrays.toString(myArr2));
    }
}
