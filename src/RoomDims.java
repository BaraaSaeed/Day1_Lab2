
/*
 * This program computes the area, perimeter and volume of a room.
 * and it requires the user to enter length, width and height.
 * @ Author: Baraa Ali
 * All rights reserved. 2019
 * */

import java.util.Scanner;

public class RoomDims {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		/* this is an infinite loop */
		for (;;) {

			System.out.println("Enter Length:");
			double length = scnr.nextDouble();

			System.out.println("Enter Width:");
			double width = scnr.nextDouble();

			System.out.println("Enter Height:");
			double hieght = scnr.nextDouble();

			double area = 0;
			double perimeter = 0;
			double volume = 0;

			area = findArea(length, width, hieght);
			perimeter = findPerimeter(length, width, hieght);
			volume = findVolume(length, width, hieght);

			System.out.println("The area is " + area);
			System.out.println("The perimeter is " + perimeter);
			System.out.println("The volume is " + volume);

			System.out.println("Continue?(y/n)");
			char userInput = scnr.next().charAt(0);
			if (userInput == 'n')
				break; /* exiting the loop */
			else
				continue; /* keep promoting the user */
		}
		System.out.println("Done!");
	}

	public static double findArea(double localWidth, double localLength, double localHieght) {

		double localArea = (2 * localWidth * localLength) + (2 * localWidth * localHieght)
				+ (2 * localLength * localHieght);
		return localArea;
	}

	public static double findPerimeter(double localWidth, double localLength, double localHieght) {
		double localPerimeter = 2 * localWidth + 2 * localLength;
		return localPerimeter;
	}

	public static double findVolume(double localWidth, double localLength, double localHieght) {
		double localVolume = localWidth * localLength * localHieght;
		return localVolume;
	}
}
