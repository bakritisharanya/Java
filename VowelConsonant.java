package akriti505.java;

import java.util.Scanner;

public class VowelConsonant {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a character: ");
	        char ch = sc.next().charAt(0);

	        switch (Character.toLowerCase(ch)) {
	            case 'a':
	            case 'e':
	            case 'i':
	            case 'o':
	            case 'u':
	                System.out.println("It is a vowel.");
	                break;

	            default:
	                System.out.println("It is a consonant.");
	        }

	        sc.close();
	    }
	}