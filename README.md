# Introduction
The Fibonacci program is a Java application that generates the Fibonacci sequence based on user input. The program provides multiple input methods, allowing the user to choose how to specify the number of elements in the Fibonacci sequence. The supported input methods are:

# Types of Input
- Buffer Input: Uses BufferedReader to read input from the console.
- Command Line Input: Takes the number of elements as a command-line argument.
- Console Input: Utilizes System.console().readLine() for input from the console.
- Scanner Input: Uses Scanner to read input from the console.
The program begins by checking whether command-line arguments are provided. If so, it uses the command-line input method (commandLineFibonacci). If not, it prompts the user to choose an input method and proceeds accordingly.

The Fibonacci sequence is then calculated using the recursive fibonacci method. For each input method, the program prints the Fibonacci sequence up to the specified number of elements.

Here's a brief summary of the input methods:

- Buffer Input: Reads input using BufferedReader and InputStreamReader.
- Command Line Input: Takes the number of elements as a command-line argument.
- Console Input: Reads input using System.console().readLine().
- Scanner Input: Reads input using Scanner.
