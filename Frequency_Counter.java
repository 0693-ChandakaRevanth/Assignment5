import java.util.*;

public class Frequency_Counter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=sc.next();
        char[] c=str.toCharArray();
        Map<Character,Integer> a=new HashMap<>();
        for(char i:c){
            if(a.containsKey(i))
                a.put(i,a.get(i)+1);
            else
                a.put(i,1);
        }
        for(Map.Entry<Character,Integer> b: a.entrySet()){
            System.out.println(b.getKey()+"--> "+b.getValue());
        }
    }
}
