public class SubsequenceProblem {
  public static void main(String[] args) {
  
    // Check if the current String is a subsequence of parent String or not.
    
    System.out.println(checkSubsequence("abdac", "abc"));
  }

  static boolean checkSubsequence(String parent, String f) {
    int i = 0;
    int j = 0;

    while (i < parent.length() && j < f.length()) {
      if (parent.charAt(i) == f.charAt(j)) {
        System.err.println(i+" "+j);
        j++; // Increment j when characters match
      }
      i++; // Always increment i
    }
    return j == f.length(); // Check if all characters of f were found
  }
}
