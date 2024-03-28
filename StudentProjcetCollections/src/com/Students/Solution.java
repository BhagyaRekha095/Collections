package com.Students;

import java.util.Scanner;

public class Solution {
	    public static String complementaryStrand(String strand) {
	        StringBuilder complementary = new StringBuilder();

	        for (char nucleotide : strand.toCharArray()) {
	            switch (nucleotide) {
	                case 'A':
	                    complementary.append('T');
	                    break;
	                case 'T':
	                    complementary.append('A');
	                    break;
	                case 'C':
	                    complementary.append('G');
	                    break;
	                case 'G':
	                    complementary.append('C');
	                    break;
	                default:
	                    throw new IllegalArgumentException("Invalid nucleotide: " + nucleotide);
	            }
	        }

	        return complementary.toString();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("input:"); 
	        int t = scanner.nextInt();
	        
	        for (int i = 0; i < t; i++) {
	            int n = scanner.nextInt(); 
	            String strand = scanner.next(); 
	            String complementaryStrand = complementaryStrand(strand);
	            System.out.println("output:   "+complementaryStrand);
	        }

	    }
}


