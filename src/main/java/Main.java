import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static BigInteger diagonal(int n, int p) {


        BigInteger one = new BigInteger("1");

        List<BigInteger[]> piramid = new ArrayList<>();


        if (n == 0) {
            piramid.add(new BigInteger[]{one});
        } else if (n == 1) {
            piramid.add(new BigInteger[]{one, one});
        } else if (n > 1) {
            piramid.add(new BigInteger[]{one});
            piramid.add(new BigInteger[]{one, one});
            short counter = 2;
            while (counter <= n) {

                BigInteger[] prev = piramid.get(counter-1);

                if (counter <= p) {
                    BigInteger[] temp1 = new BigInteger[counter + 1];
                    temp1[0] = one;
                    for (int i = 1; i < counter; i++) {
                        temp1[i] = prev[i - 1].add(prev[i]);
                    }
                    temp1[counter] = one;
                    piramid.add(temp1);
                } else if (counter > p) {
                    BigInteger[] temp2 = new BigInteger[p + 1];
                    temp2[0] = one;
                    for (int i = 1; i <= p; i++) {
                        temp2[i] = prev[i - 1].add(prev[i]);
                    }
                    piramid.add(temp2);
                }
                counter++;
            }
        }

//        piramid.forEach(j -> Collections.singletonList(j).forEach(m -> System.out.println(Arrays.toString(m))));

        BigInteger sum = new BigInteger(String.valueOf(0));
        for (int j = p; j <= n; j++) {
            sum = sum.add(new BigInteger(String.valueOf(piramid.get(j)[p])));
        }
        System.out.println(sum);
        return sum;
    }


    public static void main(String[] args) {
        diagonal(10, 5);
    }

}
