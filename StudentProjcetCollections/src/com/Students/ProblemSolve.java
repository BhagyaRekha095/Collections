package com.Students;
import java.util.Scanner;
public class ProblemSolve {
	    public static int countProblemsSolved(int score) {
	        // If score is not a multiple of 100 and not 0, it's invalid
	        if (score % 100 != 0 && score != 0) {
	            return -1;
	        }
	        
	        // Calculate the number of problems solved based on the score
	        return score / 100 + score % 100;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("enter the input: ");
	        int t = scanner.nextInt();                     // Number of test cases
	        
	        for (int i = 0; i < t; i++) {
	            int score = scanner.nextInt();                         // Total score of the participant
	            int problemsSolved = countProblemsSolved(score); // Compute number of problems solved
	            System.out.println("the output: "+problemsSolved); // Output number of problems solved or -1 if invalid score
	        }

	    }
	}



