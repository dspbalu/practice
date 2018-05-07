/*
Implement Towers Of Hanoi using recursion
*/

public class TowersOfHanoi {
 static int x;
 public static void main(String args[]) {
  int n = 3;
  x = sum(3);
  solve(n, 1, 3);
 }
 static void solve(int n, int a, int b) {
  if (n == 1) {
   System.out.println("Disk " + n + " move from " + a + " to " + b);
   return;
  }
  int helper = x - (a + b);
  //move disk to helper
  solve(n - 1, a, helper);
  System.out.println("Disk " + n + " move from " + a + " to " + b);
  //move disk from helper
  solve(n - 1, helper, b);
 }

 //this gives the sum for n rod ,which helps us to find helper 
 static int sum(int a) {
  if (a == 1)
   return 1;
  else
   return a + sum(a - 1);
 }
}
