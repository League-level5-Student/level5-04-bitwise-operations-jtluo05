package _03_Printing_Binary;

import java.util.Iterator;

public class BinaryPrinter {
	/*
	 * Complete the methods below so they print the passed in parameter in binary.
	 * Do not use the Integer.toBinaryString method! Use the main method to test
	 * your methods.
	 */

	public static void printByteBinary(byte b) {
		// We first want to print the bit in the one's place

		// Shift b seven bits to the right

		// Use the & operator to "mask" the bit in the one's place
		// This can be done by "anding" (&) it with the value of 1

		// Print the result using System.out.print (NOT System.out.println)
		byte mask = (byte) 0b10000000;
		// Use this method to print the remaining 7 bits of b
		String binaryStr = "";
		while (mask != 0) {
			if ((b & mask) != 0) {
				binaryStr += "1";
			} else {
				binaryStr += 0;
			}

			mask = (byte) ((mask & 0xFF) >>> 1);

		}
		System.out.println(binaryStr);
	}

	public static void printShortBinary(short s) {
		// Create 2 byte variables
		byte jordan = 0;
		byte jessica = 0;
		// Use bit shifting and masking (&) to save the first
		// 8 bits of s in one byte, and the second 8 bits of
		// s in the other byte
		byte mask = (byte) 0b10000000;
		byte mask1 = (byte) 0b10000000;
		while (mask != 0) {
			if ((s & mask) != 0) {
				jordan+=1;
			} else {
				jordan += 0;
			}
			mask = (byte) ((mask & 0xFF) >>> 1);
		}
		while (mask1 != 0) {
			if ((s & mask1) != 0) {
				jessica+=1;
			} else {
				jessica += 0;
			}
			mask1 = (byte) ((mask1 & 0xFF) >>> 1);
		}
		System.out.println(jordan);
		System.out.println(jessica);
		// Call printByteBinary twice using the two bytes
		// Make sure they are in the correct order
		printByteBinary(jordan);
		printByteBinary(jessica);
	}

	public static void printIntBinary(int i) {
		// Create 2 short variables

		// Use bit shifting and masking (&) to save the first
		// 16 bits of i in one short, and the second 16 bits of
		// i in the other short

		// Call printShortBinary twice using the two short variables
		// Make sure they are in the correct order
	}

	public static void printLongBinary(long l) {
		// Use the same method as before to complete this method
	}

	public static void main(String[] args) {
		// Test your methods here
		byte n = (byte) 0b00010111;
		printByteBinary(n);
		short v= (short) 0xFFFF;
		printShortBinary(v);
	}
}
