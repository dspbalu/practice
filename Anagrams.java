import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Anagrams {
 public static void main(String args[]) {
  String[] arr = new String[] {
   "cat",
   "act",
   "god",
   "dog",
   "tac"
  };
  arr = solve(arr);

 }
 static String[] solve(String[] a) {
  int[] arr = prime();
  int[] pro = new int[a.length];
  Arrays.fill(pro, 1);
  for (int i = 0; i < a.length; i++) {
   for (int j = 0; j < a[i].length(); j++) {
    pro[i] *= arr[(a[i].charAt(j)) - 'a'];
   }
  }
  HashMap < Integer, ArrayList < String >> map = new HashMap < Integer, ArrayList < String >> ();
  for (int i = 0; i < a.length; i++) {
   if (map.containsKey(pro[i])) {
    ArrayList < String > ob = map.get(pro[i]);
    ob.add(a[i]);
    map.put(pro[i], ob);
   } else {
    ArrayList < String > ob = new ArrayList < String > ();
    ob.add(a[i]);
    map.put(pro[i], ob);
   }
  }
  System.out.println(map);
  return a;
 }
 static int[] prime() {
  int[] arr = new int[26];
  int count = 3;
  arr[0] = 2;
  for (int i = 1; i < 26; count++) {
   if (isprime(count)) {
    arr[i] = count;
    i++;
   }
  }
  for (int i: arr)
   System.out.println(i);
  return arr;
 }
 static boolean isprime(int a) {
  for (int i = 2; i <= a / 2; i++) {
   if (a % i == 0)
    return false;
  }
  return true;
 }
}
