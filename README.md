This is Assignment1 Project made by Aizere Salim from SE-2215 for Algorithms and Sata Structures course in Astana IT University.
Project consists of 10 tasks:
First task - Find min out of range of int numbers
How solved: The program defines a method called solve() which initializes an array of integers and calls the findMin() method to find the minimum value in the array. The findMin() method is a recursive method that takes an array and its length as input parameters.

Second task - The task2 class contains a static method solve() which calculates the average of a given array of integers.  How solved:The calculateAverage(int[] arr) method is used to calculate the average of the integers in the input array arr.



Third task - checks if a given number is prime or not. How solved: The program defines a method called isPrime that takes an integer n as input and returns a boolean value indicating whether n is prime or not.



Fourth task - takes an integer input from the user and calculates its factorial using recursion. How solved: The program begins by importing the Scanner class to read user input from the console. It then prompts the user to enter a number and reads it using the nextInt() method of the Scanner class.
The program then calls the findFactorial() method with the user input as an argument. This method uses recursion to calculate the factorial of the input number. If the input is 0 or 1, it simply returns 1 as the factorial of these numbers is defined as 1. Otherwise, it multiplies the input number by the factorial of n-1 until n=1 is reached.

Fifth task -  Fibonacci that takes an integer n and returns the nth number in the Fibonacci sequence. The main method solve prompts the user to input a value for n and calls the Fibonacci method to compute the result, which is then printed to the console. The Fibonacci method is implemented using recursion. If n is 0 or 1, the method returns the corresponding value. Otherwise, it recursively calls itself with n-1 and n-2 as input values and adds the results.

Sixth task - akes two integer arguments, a and n, and returns the result of a raised to the power of n. The implementation follows the basic principle that a raised to the power of n can be calculated by multiplying a by itself n times. So, the function recursively calls itself with the same value of a and n-1 until n becomes 0. When n becomes 0, the function returns 1 as the base case of the recursion.



Seventh task -  reverses an array of integers using recursion. The program defines a static method solve that takes three arguments: an integer array arr, an integer start representing the starting index of the sub-array to be reversed, and an integer end representing the ending index of the sub-array to be reversed.

Eighth task - This is a recursive function named solve that takes a string as input and returns a boolean value. The function checks whether the string contains only digits or not.
The function first checks if the input string is empty. If it is empty, it returns true since an empty string is considered to be all digits.



Ningth task - The task9 class contains a recursive method "solve" that takes two integer arguments "n" and "k" and returns an integer value.
The "solve" method computes the binomial coefficient of "n" and "k", which is the number of ways to choose "k" items from a set of "n" items. The binomial coefficient is computed using the formula C(n,k) = C(n-1,k-1) + C(n-1,k), where C(n,k) represents the binomial coefficient of "n" and "k".

Tenth task - This is an implementation of the Euclidean algorithm for finding the greatest common divisor (GCD) of two numbers "a" and "b".
The method "solve" takes two integer arguments, "a" and "b", and returns their GCD.
The algorithm works by repeatedly dividing "a" by "b" and taking the remainder until "b" becomes zero. The final remainder, which is the last non-zero value of "b", is the GCD of "a" and "b".
