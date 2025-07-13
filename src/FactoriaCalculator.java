import java.math.BigInteger;

import static java.util.stream.IntStream.rangeClosed;

public class FactoriaCalculator {
    public static void factoria (int i){
        if(i < 0){
            throw new IllegalArgumentException("отрицательное число");
        }

        BigInteger bI = rangeClosed(1, i).mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get();
        System.out.println(bI);
    }
}