public class AllTheSubsequencesStringProblem {
  public static void main(String[] args) {
    // Print all the subsequences of a given string
    printSubSequence("abcac", 0, "");
  }

  static void printSubSequence(String str, int index, String result) {
    // Base condition
    if (str.length() == index) {
      System.out.println(result);
      return;
    }
    // Include the current character
    printSubSequence(str, index + 1, result + str.charAt(index));
    // Exclude the current character
    printSubSequence(str, index + 1, result);
    
  }
}
