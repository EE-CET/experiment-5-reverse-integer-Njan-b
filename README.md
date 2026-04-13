[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/TZp-2dWb)
# Experiment 5: Reverse Integer

## Problem Statement

Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
For example, if the input is `12345`, the output should be `54321`.

**Note:** The input number will not have any trailing zeros (e.g., input will not be 120).

## Input Format

The first line of input contains the integer $n$.

## Output Format

The output should be the reverse of $n$.

### Example 1

**Input:**

```text
12345
```

**Output**
```text
54321
```

**Explanation**
We extract the last digit of the number using the modulo operator (%), add it to the reversed number (after multiplying the current reversed number by 10), and then divide the original number by 10. Repeat until the number becomes 0.
