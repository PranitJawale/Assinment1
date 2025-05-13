

public class LargestOfThree {
    public static void main(String[] args) {
      
        int num1 = 26;

       
        int num2 = 36;

       
        int num3 =45;

       
        int largest;
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        
        System.out.println("The largest number is: " + largest);

       
    }
}
