package BasicsArray;


/*
* Reverse array
* Max and SecondMax Element in an array
*
*
* HomeWork
* Reverse array(using collection)new ArrayList<Integer>
* Min and SecondMin Element in an array
*
*
*
*
* */

public class ReverseArray {
    public static void main(String[] args) {
        printAlternateElemet();
    }
    public static void reverseArray(int[] arr){
       int start=0;
       int end=arr.length-1;//O(1)
       while(start<end){
           int temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
       }

    }

    public static void maxElement(int []nums){
        int max=Integer.MIN_VALUE;
        int [] numbers={-1,-10,-4,-99,-5};
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
    }
    public static void secondMaxElement(){

        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        int [] numbers={-1,-10,-4,-99,-5};
        for(int i=0;i<numbers.length;i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > secondMax && numbers[i] < max) {
                secondMax = numbers[i];
            }
        }

    }


    public static void duplication(){
        int [] orginalList={1,2,3,4,5};
        int [] duplicateList=new int[orginalList.length];
        for(int i=0;i<orginalList.length;i++){
            duplicateList[i]=orginalList[i];
        }
    }

    public static void printAlternateElemet(){
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i=0;i<ints.length;i=i+2){
            System.out.println(ints[i]);
        }

        for(int i=0;i<ints.length;i++){
            if(i%2!=0){
                System.out.println(ints[i]);
            }
        }


    }

    public static void printOccurance(){
        int [] numbers={1,2,3,4,5,5,5,7,8,9,10};
        int target=5;
        int count=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==target){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void isArraySorted(){
        int [] numbers={1,2,3,4,5,7,8,9,10};
        boolean isSorted=true;
        for(int i=0;i<numbers.length-1;i++){

            if(numbers[i]>numbers[i+1]){
                isSorted=false;
                break;
            }


        }
        System.out.println(isSorted);
    }




}
