import java.util.Arrays;

public class Task05 {
    public static void main(String[] args) {
        int [] myArr = new int[20];
        for (int i=0;i< myArr.length;i++){
            myArr[i] = (int) (Math.random()*30-10);
        }
        int tmp = 0;
        int max = 0;
        int pos = 0;
        int posMax = 0;
        for (int i=0;i< myArr.length;i++){
            if (myArr[i]>0&&tmp==0) pos=i;
            if (myArr[i]>0) tmp++;
            if (tmp>max) {max=tmp;posMax = pos;}
            if (myArr[i]<=0) tmp=0;
        }
        System.out.println(Arrays.toString(myArr));
        for (int i=posMax;i<posMax+max;i++){
            System.out.print(myArr[i]+" ");
        }
        System.out.println();
        System.out.println(max);
    }
}
