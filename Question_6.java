import java.util.Scanner;
public class Main {
    static void frequency(int sub[], int Super[]) {
        int Super[] = {3, 1, 3, 4, 1, 2, 1, 8, 3, 2, 1, 1, 3, 2, 3, 3, 4};
        int sub[] = {1, 2, 3, 5, 9};
        {
            for (int i = 0; i < Super.length; i++) {
                int c = 0;
                for (int j = 0; j < sub.length; j++) {
                    if (Super[i] == sub[j]) {
                        c++;
                    }
                }}
                System.out.println("Frequency of " + Super[i] + ": " + c);
            }
        }
        public static void main (String[]args){
            //System.out.println("Hello World");
            Scanner sc = new Scanner(System.in);
            int N1 = sc.nextInt();

            for (int i = 0; i < N1; i++) {
                sub[i] = sc.nextInt();
            }
            int N2 = sc.nextInt();

            for (int i = 0; i < N2; i++) {
                Super[i] = sc.nextInt();
            }
            frequency(sub, Super);
        }
    }

