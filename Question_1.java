public class Question_1 {
    public static void main(String[] args){
    int arrNum[] = {31, 42, 25, 21, 56,  61, 13, 45, 76, 55};
    int minimum = arrNum[0];
    int maximum = arrNum[1];
    int sum = 0;
    int average = 0;

    for(int index = 0; index < arrNum.length; index++){
        if(arrNum[index] < minimum)
            minimum = arrNum[index];
    }
        System.out.println("The element with the Minimum value: " + minimum);


        for(int index = 0; index < arrNum.length; index++){
            if(arrNum[index] > maximum)
                maximum = arrNum[index];
        }
        System.out.println("The element with the Maximum value: " + maximum);

        for(int index = 0; index < arrNum.length; index++){
             sum = (sum + arrNum[index]);
        }

        average= sum / arrNum.length;
        System.out.println("Average of all array elements: " + average);

        System.out.println("Total number of array elements: " + arrNum.length);

    }
}
