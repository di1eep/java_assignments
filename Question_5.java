public class Question_5 {
    static void main(int arrNum[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++)
            if (arrNum[i] != 1)
                arrNum[count++] = arrNum[i];

        while (count < n)
            arrNum[count++] = 1;
    }
    public static void main (String[] args)
    {
        int arrNum[] = {3, 1, 4, 1, 2, 1, 8, 3, 2, 1};
        int n = arrNum.length;
        main(arrNum, n);
        System.out.println("Array elements after moving Ones to end: ");
        for (int i=0; i<n; i++)
            System.out.print(arrNum[i]+" ");
    }
}