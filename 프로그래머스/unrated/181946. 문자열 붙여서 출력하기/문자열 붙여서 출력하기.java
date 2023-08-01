import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        StringBuffer sf = new StringBuffer();
        
        sf.append(a);
        sf.append(b);
        
        System.out.println(sf);
    }
}