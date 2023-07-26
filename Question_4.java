public class Question_4 {
    public static void main(String[] args) {


        int arrNum[] = {2, 29, 51, 8, 4};
        int max = arrNum[0];
        for(int i=0; i<arrNum.length; i++){
            boolean isPrime = true;
            for (int j=2; j<arrNum[i]; j++){ // prime number validation = more than 2 multiples = not prime
                if(arrNum[i]%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)   // finding the max of array initially we assumed index 0 as max 
                if(max < arrNum[i]){
                    max = arrNum[i];
                }

        }
        System.out.println("The Largest Prime number in given array:"+ max);

    }
}

