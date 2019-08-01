import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static BigInteger diagonal(int n, int p) {

        int one = 1;

        int counter = 2;
        List<int[]> piramid = new ArrayList<>();
        piramid.add(new int[]{1});
        piramid.add(new int[]{1, 1});

        if (n == 0) {
            piramid.add(new int[]{1});
        } else if (n == 1) {
            piramid.add(new int[]{1, 1});
        } else if (n > 1) {
            while (counter <= n) {

                int[] prev = piramid.get(counter-1);
                int[] temp = new int[counter+1];

                temp[0]=1;
                for( int i=1; i<temp.length-1; i++){
                    temp[i]=prev[i-1]+prev[i];
                }
                temp[counter]=1;

                piramid.add(temp);
                counter++;
            }
        }

        piramid.forEach(j-> Collections.singletonList(j).forEach(m-> System.out.println(Arrays.toString(m))) );

        int sum =0;
        for(int j = p; j<=n; j++){
            sum = sum +piramid.get(j)[p];
        }

        System.out.println(sum);
        return new BigInteger(String.valueOf(sum));
    }


    public static void main(String[] args) {
        diagonal(7, 0);
    }

}
