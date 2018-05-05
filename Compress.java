public class Compress {
 public static void main(String args[]) {
  String x = "fooo";
  if (x.length() == 0)
   System.out.println("");
  else {
   String a = solve(x.length() - 1, 1, x);
   System.out.println(a);
  }
 }
 static String solve(int index, int count, String a) {
  if (index == 0) {
   a = a.substring(0, index + 1) + count + a.substring(index + count);
   return a;
  }
  if (a.charAt(index) == a.charAt(index - 1))
   a = solve(index - 1, count + 1, a);
  else {
   a = a.substring(0, index + 1) + count + a.substring(index + count);
   //System.out.println(a);
   a = solve(index - 1, 1, a);
  }
  return a;
 }
}
