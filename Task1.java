
/*LinkedIn - SDE Intern:

Question: Given a list of words, if any two adjacent characters in a word
 are equal, change one of them. Determine the minimum number of 
 substitutions so the final string contains no adjacent equal characters.
Example:
Input: ['add', 'boook', 'break']
Output: [1, 1, 0]*/
import java.util.*;

public class Task1 {
    public static int[] minSwaps(String[] input) {
        int ans[] = new int[input.length];
        int k = 0;
        for (String ss : input) {
            String s = ss.toLowerCase();
            int[] ch = new int[26];
            for (int i = 0; i < s.length(); i++) {
                ch[s.charAt(i) - 97]++;
            }
            int changes = 0;
            for (int i = 0; i < 26; i++) {
                if (ch[i] > 1) {
                    changes += (ch[i] / 2);
                }
            }
            ans[k++] = changes;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        String ar[] = new String[l];
        for (int i = 0; i < l; i++) {
            ar[i] = sc.next();
        }
        int ans[] = minSwaps(ar);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
        sc.close();
    }
}