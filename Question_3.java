public class Question_3 {
    public static void main(String[] args) {
        int temp = 0;
        int arrNum[] = {23, 21, 44, 32, 12};

        for (int i = 0; i < arrNum.length; i++) {
            for (int j = i + 1; j < arrNum.length; j++) {
                if (arrNum[i] > arrNum[j]) {
                    temp = arrNum[i];
                    arrNum[i] = arrNum[j];
                    arrNum[j] = temp;
                }
            }
        }
        System.out.print("The elements in ascending order:");
        for (int i = 0; i < arrNum.length; i++) {
            System.out.print(arrNum[i] + " " );

        }
        System.out.println("\n");


        System.out.print("The elements in descending order:");
        for(int i= arrNum.length-1; i >= 0; i--) {
            System.out.print(arrNum[i] + " ");
        }
        }

    }