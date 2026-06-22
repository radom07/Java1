package Task3;

import java.math.BigInteger;
import java.util.Random;
import java.util.concurrent.Callable;

public record Factorial(int number) implements Callable<BigInteger> {

    @Override
    public BigInteger call() throws Exception {
        var randomDelay = new Random().nextLong(100, 501);
        Thread.sleep(randomDelay);
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
