/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer in Jan 2024
 */
import java.util.Scanner;
public class Main {

    // Finished lab
    public static void main(String[] args){
        
        int number = getInputNumber();

        final long sumStartTime = System.currentTimeMillis();
        int sum = sumOfNumbers(number);
        final long sumEndTime = System.currentTimeMillis();
        final long totalSumTime = sumEndTime - sumStartTime;

        final long gStartTime = System.currentTimeMillis();
        int gaussianSum = gaussianSumOfNumbers(number);
        final long gEndTime = System.currentTimeMillis();
        final long totalGTime = gEndTime - gStartTime;
        
        System.out.println("Regular sum = " + sum + " Calculated in " + totalSumTime);
        System.out.println("Gaussian sum = " + gaussianSum + " Calculated in " + totalGTime);

    }
    
    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
    static int sumOfNumbers(int n) {

        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    
    
    static int getInputNumber() { // gee, may thi sis useful in another lab?
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        return num;
    }
    
    
    
    // for Extra Credit
    static int gaussianSumOfNumbers(int n) {
        int numerator = n * (1 + n);
        return numerator / 2;
    }
   
    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.
}
