/*
Implement Towers Of Hanoi using recursion
*/

public class TowersOfHanoi {
 public static void main(String args[]) {
  int n = 3;
  solve(n, 1, 3);
 }
 static void solve(int n, int a, int b) {
  if (n == 1) {
   System.out.println("Disk " + n + " move from " + a + " to " + b);
   return;
  }
  int helper = 6 - (a + b);
  solve(n - 1, a, helper);
  System.out.println("Disk " + n + " move from " + a + " to " + b);
  solve(n - 1, helper, b);
 }
}
