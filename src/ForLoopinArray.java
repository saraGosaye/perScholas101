public class ForLoopinArray {
    public static void main(String[] args) {
        double[] numList = {121.3, 200.1, 325.4, 158};

//       To print out all the elements of an array
        for (int i = 0; i < numList.length; i++){
            System.out.println(numList[i]);
        }
//        To add all the elements of an array
        double sum = 0; //to initialize double data type sum variable to be 0
        for (int i=0; i < numList.length; i++){
            sum = sum + numList[i];

        }
        System.out.println("The sum is: " + sum);

//        Find the largest element of an array
        double max = numList[0]; //Initializing the first element to be the largest element
        for (int i = 1; i < numList.length; i++){
            if(numList[i] > max){
                max = numList[i];
            }
        }
        System.out.println("The maxiumu number is " + max);
    }
}
