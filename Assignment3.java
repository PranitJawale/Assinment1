Q.1 Write a Program to check if a number is even or odd.
   import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
		
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        scanner.close();
    }
}

Q.2 .Write A Program to check if a number is prime or not.
    import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        
        if (number < 2) {
            isPrime = false;
        } else {
            
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}
Q.3 Write A Program to print numbers from 1 to 20.
    public class PrintNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
    }
}

Q.4 Write A Program to print numbers from 1 to 10, excluding 5 and 6.
     public class PrintNumbersExcluding5and6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5 || i == 6) {
                continue; 
            }
            System.out.println(i);
        }
    }
}

Q.5 Write A Program to print the table of 5.
    public class TableOfFive {
    public static void main(String[] args) {
        int number = 5;

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

Q.6 .Write A Program to print "Hello" five times.
     public class PrintHello {
    public static void main(String[] args) {
    
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
        }
    }
}

Q.7 .Write A Program to print any multiplication table for a given number.
     import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to display its multiplication table: ");
        int number = scanner.nextInt();
        
        System.out.println("Multiplication Table for " + number + ":");
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        
        scanner.close();
    }
}

Q.8 Write A Program to print the reverse of 1234.
    public class ReverseNumber {
    public static void main(String[] args) {
        
        int number = 1234;
        
        int reversedNumber = 0;
        
        while (number != 0) {
            int digit = number % 10;           
            reversedNumber = reversedNumber * 10 + digit; 
            number /= 10;                      
        }
        
        System.out.println("Reversed number: " + reversedNumber);
    }
} 

Q.9 Write A java Program to check if 121 is a palindrome.
    public class PalindromeCheck {
    public static void main(String[] args) {
        int number = 121;
        int originalNumber = number;
        int reversedNumber = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome");
        } else {
            System.out.println(originalNumber + " is not a palindrome");
        }
    }
}

Q.10 Write A java Program to check if a given number is a palindrome.
     import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int reversedNumber = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome");
        } else {
            System.out.println(originalNumber + " is not a palindrome");
        }
        
        scanner.close();
    }
}

Q.11 Write A java Program to check if 153 is an Armstrong number.
     public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        int originalNumber = number;
        int sum = 0;
        
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }
        
        if (originalNumber == sum) {
            System.out.println(originalNumber + " is an Armstrong number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number");
        }
    }
}

Q.12 Write A java Program to check if a given number is an Armstrong number.
     import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();
        
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }
        
        if (originalNumber == sum) {
            System.out.println(originalNumber + " is an Armstrong number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number");
        }
        
        scanner.close();
    }
}

Q.13 .Write A java Program to print all Armstrong numbers from 1 to 1000.
      public class ArmstrongNumbers {
    public static void main(String[] args) {
        for (int number = 1; number <= 1000; number++) {
            int originalNumber = number;
            int sum = 0;
            int digits = String.valueOf(number).length();
            
            while (number != 0) {
                int digit = number % 10;
                sum += Math.pow(digit, digits);
                number /= 10;
            }
            
            if (originalNumber == sum) {
                System.out.println(originalNumber);
            }
            
            number = originalNumber;
        }
    }
}

Q.14 Write A java Program to print all palindrome numbers from 1 to 100.
     public class PalindromeNumbers {
    public static void main(String[] args) {
        for (int number = 1; number <= 100; number++) {
            int originalNumber = number;
            int reversedNumber = 0;
            
            while (number != 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }
            
            if (originalNumber == reversedNumber) {
                System.out.println(originalNumber);
            }
            
            number = originalNumber;
        }
    }
}







