public class CountLetters {
  public static void main(String[] args) {
    // put your code here
  }

  public static int countLetters(String str) {
    int count = 0;
    for (char c : str.toCharArray()) {
      if (Character.isLetter(c)) {
        count++;
      }
    }
    return count;
  }
}