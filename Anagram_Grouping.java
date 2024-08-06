import java.util.*;
public class Anagram_Grouping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        String[] s = new String[n];
        Map<String,String> a=new HashMap<>();
        for(int i=0;i<n;i++){
            s[i]=sc.next();
            char[] ch=s[i].toCharArray();
            Arrays.sort(ch);
        }
    }
}