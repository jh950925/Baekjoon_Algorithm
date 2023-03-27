import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());

        long a = Long.parseLong(tk.nextToken());
        long b = Long.parseLong(tk.nextToken());
        long c = Long.parseLong(tk.nextToken());

        System.out.println(a + b + c);
    }
}
