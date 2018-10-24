import java.util.Scanner;
import java.lang.Math;

public class PaintAreaCalc2
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		//declare variables
		double length, height, width, doors, windows, doorArea, windowArea, area, quartArea, numGallons, numQuarts;
		final int GALLON_SQUARE_FEET = 300;
		final int QUART_SQUARE_FEET = 75;
		final int WINDOW_AREA = 12;
		final int DOOR_AREA = 21;
		final int NUM_SIDES = 2;
		//collect room information
		System.out.print("Enter room height: ");
		height = scan.nextDouble();
		System.out.print("\nEnter room width: ");
		width = scan.nextDouble();
		System.out.print("\nEnter room length: ");
		length = scan.nextDouble();
		System.out.print("\nEnter number of windows: ");
		windows = scan.nextDouble();
		System.out.print("\nEnter number of doors: ");
		doors = scan.nextDouble();
		//calculate area
		doorArea = (doors * DOOR_AREA);
		windowArea = (windows * WINDOW_AREA);
		area = ((((length * height) * NUM_SIDES) + ((width * height) * NUM_SIDES)) - (windowArea + doorArea));
		System.out.println("\nTotal area is: " + area + " square feet");
		//calculate number of gallon cans needed
		numGallons = Math.ceil(area / GALLON_SQUARE_FEET);
		numGallons = (int) numGallons;
		String gallonOutput;
		if (numGallons > 1) {
			gallonOutput = "If gallons only: " + numGallons + " gallons";
		} else {
			gallonOutput = "If gallons only: " + numGallons + " gallon";
		}
		System.out.println(gallonOutput);
		//calculate number of gallon and quart cans needed
		quartArea = area % GALLON_SQUARE_FEET;
			//System.out.println(quartArea);
		numQuarts = Math.ceil(quartArea / QUART_SQUARE_FEET);
			//System.out.println(numQuarts);
		numQuarts = (int) numQuarts;
		numGallons = Math.floor(area / GALLON_SQUARE_FEET);
			//System.out.println(numGallons);
		numGallons = (int) numGallons;
		String quartOutput;
		if (numGallons > 1) {
			quartOutput = "If quarts are available: " + numGallons + " gallons";
		} else {
			quartOutput = "If quarts are available: " + numGallons + " gallon";
		}
		if (numQuarts > 1) {
			quartOutput += (" and " + numQuarts + " quarts");
		} else if (numQuarts == 0) {
			quartOutput = quartOutput;
		} else {
			quartOutput += (" and " + numQuarts + " quart");
		}
		System.out.println(quartOutput);
	}
}