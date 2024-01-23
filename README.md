# SumOfInput

# Sum the Numbers

## **Objective:**

* Write a program which prompts the user to input a number, `n`.
* The program should respond by printing the sum of the numbers 1 to `n`.
* **Constraint:** No [Guassian wizardry](http://mathandmultimedia.com/2010/09/15/sum-first-n-positive-integers/) !

### Extra Credit (no, not really)

_If you find this lab to be super simple, then implment these two requirements._ If you're quite lost, skip them for now.

* *Extra Credit* (get 256 pts) create a second method which USES the Gaussian Wizardry
* **Extra EXTRA Credit** (32,767 pts) create a comparison of the two methods And *time them, showing which one is faster!!!*

### **Purpose:**
* To establish familiarity with
    * Loops
    * User input
    * Object instantation/declaration
    * Method invokation

### **Resources:**

This is a pretty advanced topic for this lab. Welcome to Zip Code.

#### timing loops

To time two different Java loops, you can use the `System.currentTimeMillis()` method to get the current time in milliseconds before and after each loop, and then calculate the difference between the two times to get the elapsed time.

Here is an example of how to time two different Java loops:

```java
public class LoopTimingExample {
    public static void main(String[] args) {
        long startTime, endTime, elapsedTime;

        // Loop 1
        String foo = "!";
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            // do something
            foo = "foo" + foo + "bar";
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("Loop 1 elapsed time: " + elapsedTime + " ms");

        // Loop 2
        String bar = "^";
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            // do something else
            bar = bar + "bar ";
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("Loop 2 elapsed time: " + elapsedTime + " ms");
    }
}
```
In this example, two loops are timed using the System.currentTimeMillis() method. The elapsed time for each loop is calculated by subtracting the start time from the end time, and the result is output to the console.

Timing Java loops can be useful for measuring the performance of different algorithms or code optimizations.

## Unit Test
No Unit Tests (well, not yet).

## What's a millisecond?

A millisecond is a unit of time that is equal to one thousandth of a second. It is commonly used in computer programming to measure the duration of operations or to time events. For example, a program might measure the time it takes to perform a calculation in milliseconds, or it might use a delay of a certain number of milliseconds to control the timing of events. In general, a millisecond is a very short amount of time, but it can be significant in certain contexts, such as real-time systems or high-performance computing.

