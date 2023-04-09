This is Assignment1 Project made by Aizere Salim from SE-2215 for Algorithms and Sata Structures course in Astana IT University.
Project consists of 10 tasks:

First task - Find min out of range of int numbers
How solved: The program defines a method called solve() which initializes an array of integers and calls the findMin() method to find the minimum value in the array. The findMin() method is a recursive method that takes an array and its length as input parameters.

Second task - The task2 class contains a static method solve() which calculates the average of a given array of integers.  How solved:The calculateAverage(int[] arr) method is used to calculate the average of the integers in the input array arr.



Third task - checks if a given number is prime or not. How solved: The program defines a method called isPrime that takes an integer n as input and returns a boolean value indicating whether n is prime or not.



Fourth task - takes an integer input from the user and calculates its factorial using recursion. How solved: The program begins by importing the Scanner class to read user input from the console. It then prompts the user to enter a number and reads it using the nextInt() method of the Scanner class.
The program then calls the findFactorial() method with the user input as an argument. This method uses recursion to calculate the factorial of the input number. If the input is 0 or 1, it simply returns 1 as the factorial of these numbers is defined as 1. Otherwise, it multiplies the input number by the factorial of n-1 until n=1 is reached.

Fifth task - This program implements a method Fibonacci that takes an integer n and returns the nth number in the Fibonacci sequence. How solved: he main method solve prompts the user to input a value for n and calls the Fibonacci method to compute the result, which is then printed to the console.



Sixth task - The code implements a recursive function solve that takes two integer arguments, a and n, and returns the result of a raised to the power of n. How solved: the function recursively calls itself with the same value of a and n-1 until n becomes 0. When n becomes 0, the function returns 1 as the base case of the recursion.



Seventh task - reverses an array of integers using recursion.How solved: The solve method uses recursion to reverse the sub-array. The base case is when start >= end, which means that the array is already reversed. In this case, the method simply returns without doing anything.



Eighth task - The function checks whether the string contains only digits or not. How solved: Character.isDigit method. If the character is not a digit, it returns false. If the character is a digit, it calls the solve function recursively with the rest of the string obtained by using the substring method, which takes a starting index and returns the substring from that index to the end of the string.



Ningth task - takes two integer arguments "n" and "k" and returns an integer value. How solved: The method uses recursion to compute the binomial coefficient. If "k" is equal to 0 or "k" is equal to "n", the method returns 1. Otherwise, it recursively calls itself with "n-1" and "k-1" as arguments, and adds the result of that call to the result of another recursive call with "n-1" and "k" as arguments.

Tenth task - This is an implementation of the Euclidean algorithm for finding the greatest common divisor (GCD) of two numbers "a" and "b". How solved: The algorithm works by repeatedly dividing "a" by "b" and taking the remainder until "b" becomes zero. The final remainder, which is the last non-zero value of "b", is the GCD of "a" and "b".
