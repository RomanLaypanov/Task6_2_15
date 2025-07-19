import java.math.BigInteger;

import static java.util.stream.IntStream.rangeClosed;

public class FactorialCalculator {
    public static BigInteger factorial(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("отрицательное число");
        }

        return rangeClosed(1, i).mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get();
    }
}