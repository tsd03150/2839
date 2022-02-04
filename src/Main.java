import java.util.Arrays;
import java.util.Scanner;

class Main {
    static int[] arr;

    public int solution(int n) {
        int[] bag = {3, 5};
        Arrays.fill(arr, Integer.MAX_VALUE-1);
        arr[0] = 0;

        for (int i = 0; i < bag.length; i++) {

            for (int j = bag[i]; j <= n; j++) {

                arr[j] = Math.min(arr[j], arr[j - bag[i]] + 1);

            }
        }

        for (int i = 0; i <= n; i++) {
            if(arr[i] == Integer.MAX_VALUE-1) {
                arr[i] = -1;
            }
        }

        return arr[n];

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        arr = new int[n+1];

        System.out.println(T.solution(n));
    }

}
