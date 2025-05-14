import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testPrime(){
    Assert.assertTrue(PrimeNumbers.isPrime(2));
    Assert.assertTrue(PrimeNumbers.isPrime(3));
    Assert.assertTrue(PrimeNumbers.isPrime(5));
    Assert.assertTrue(PrimeNumbers.isPrime(7));
    Assert.assertTrue(PrimeNumbers.isPrime(11));
    Assert.assertTrue(PrimeNumbers.isPrime(13));
    Assert.assertTrue(PrimeNumbers.isPrime(17));
    Assert.assertTrue(PrimeNumbers.isPrime(19));
    Assert.assertTrue(PrimeNumbers.isPrime(23));
    Assert.assertTrue(PrimeNumbers.isPrime(29));
    Assert.assertFalse(PrimeNumbers.isPrime(1));
    Assert.assertFalse(PrimeNumbers.isPrime(4));
    Assert.assertFalse(PrimeNumbers.isPrime(-6));
    Assert.assertFalse(PrimeNumbers.isPrime(0));
  }
}