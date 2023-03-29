import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        
        int count = sc.nextInt();
        int[] arr = new int[count];
        int cnt = 0;

        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

        int num = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }//end main
}//end class
