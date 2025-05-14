public class PrimeNumbers {
  public static void main(String[] args) {

  }

  public static boolean isPrime(int x) {
    if (x < 2) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(x); i++) {
      if (x % i == 0) {
        return false;
      }
    }
    return true;
  }
}