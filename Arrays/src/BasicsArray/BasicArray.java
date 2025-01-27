package BasicsArray;

import java.util.Arrays;


public class BasicArray {
    public static void main(String[] args) {
        printProductOfEachElement();
    }

    //Print each element and its index in an array.
    public static void printEachElement() {
        int[] numbers = new int[10];
        for(int i=0; i<numbers.length; i++) {
            numbers[i] = i*10;//0,
        }
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

    }
    //print even/odd numbers in an array and store them separately
    public static void evenOddStorage(){
        int[]numbers={1,11,33,44,12,19,20,18,0,2,5};
        int evenCount=0;
        int oddCount=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("event count --> "+evenCount);
        System.out.println("odd count --> "+oddCount);

        int[] evenArray = new int[6];
        int[] oddArray = new int[5];

        int evenIndex=0;
        int oddIndex=0;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){
                evenArray[evenIndex]=numbers[i];
                evenIndex++;

            }else{
                oddArray[oddIndex]=numbers[i];
                oddIndex++;

            }
        }
        System.out.println(Arrays.toString(evenArray));
        System.out.println(Arrays.toString(oddArray));

    }

    public static void printSumOfElement(){
        int[]numbers={1,2,3,4,5};
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];
        }
        System.out.println(sum);

    }

    public static void printProductOfEachElement(){
        int[]numbers={1,2,3,4,5};
        int sum=1;
        for(int i=0;i<numbers.length;i++){
            sum=sum*numbers[i];
        }
        System.out.println(sum);

    }


}
