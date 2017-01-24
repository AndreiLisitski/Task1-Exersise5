import java.util.Scanner;

/**
 * Created by Andrei_Lisitski on 1/19/2017.
 */
public class Task1Ex5 {
    static int res;

    public static int suare( int a) {
        res = a * a;
        System.out.print(res + " ");
        return res;
    }
    public static int fourthDegree( int a){
        res = a * a * a * a;
        System.out.print(res + " ");
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array ");
        int size = sc.nextInt();
        int[] mas = new int[size];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextInt();
        }

        for (int i = 0; i < mas.length; i++){
            System.out.println(mas[i]);
        }
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0) {
                res = suare(mas[i]);
            } else res = fourthDegree(mas[i]);

        }
    }
}
