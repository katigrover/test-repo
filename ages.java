package codingAssignment3and4;

public class ages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1a
		System.out.println("1a - Subtracted 1st element in the array from the last element in the array.");
		
		int[] ages = new int[]{3, 9, 23, 64, 2, 8, 28, 93};
			System.out.println(ages[ages.length-1] - ages[0]); 
		
		System.out.println(" ");
		
		//1b
		System.out.println("1b - Added new age to existing array and subtracted new last element from first element.");
		
		int addAge = 35;
		int[] addAge1 = new int[ages.length + 1];
			for (int k = 0; k < ages.length; k++) {
				addAge1[k] = ages[k];
		}		addAge1[addAge1.length -1] = addAge;
			System.out.println(addAge1[addAge1.length-1] - ages[0]);
		
		System.out.println(" ");
				
		//1c
		System.out.println("1c - Calculated the average age of the array.");		
				
		int num = 0;
		int den = addAge1.length;
			for (int i = 0; i < addAge1.length; i++) {
				num += addAge1[i];
		}		
			System.out.println(num/den);
		
		System.out.println(" ");
		
		//2
		System.out.println("2a - Calculated the average number of letters per name.");
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int top = 0;
		int bottom = names.length;
			for (int n = 0; n < names.length; n++) {
				top += names[n].length();
		}		
			System.out.println(top/bottom);
		
		System.out.println(" ");
		
		//2b
		System.out.println("2b - Concatenated all elements in the array with spaces between them.");
		
		String newString = "";
			for (int b = 0; b < names.length; b++) {
				newString += names[b] + " ";
		}		
			System.out.println(newString);
		
		System.out.println(" ");
		
		//3 
		
			System.out.println("3 - The last element of an array is accessed by: array.length-1");
		
		System.out.println(" ");
		
		//4 array[0]
		
			System.out.println("4 - The first element of an array is accessed by: array[0].");
		
		System.out.println(" ");
		
		//5
		
		System.out.println("5 - Added lengths to the Array");
		
		int nameLengths[] = new int[names.length];
			for (int c = 0; c < names.length; c++) {
				nameLengths[c] = names[c].length();
				System.out.println(nameLengths[c]);
		}	
			System.out.println(" ");
			
		//6	
			
		System.out.println("6 - Calculated the sum of all elements in the nameLengths array.");	
			
		int sum = 0;
			for (int d = 0; d < nameLengths.length; d++) {
				sum += nameLengths[d];
		}		System.out.println(sum);
		
		System.out.println(" ");
		
		//7
		
		System.out.println("7 - WAM that concatenates a word within itself n number of times.");
		
		System.out.println(duplicateString("Broncos", 5));
				
		System.out.println(" ");
		
		//8
		
		System.out.println("8 - Write 2 Strings and return a full name with proper spacing.");
		
		String firstName = "Kati";
		String lastName = "Grover";
		String fullName = createFullName(firstName, lastName);
		
		System.out.println(fullName);
		
		
		System.out.println(" ");
		
		//9
		
		System.out.println("9 - WAM that takes an array of int and returns true if all sum is greater than 100.");
		
		int[] totalArray = new int[5];
		totalArray[0] = 9;
		totalArray[1] = 10;
		totalArray[2] = 18;
		totalArray[3] = 22;
		totalArray[4] = 24;
		
		int total = validity(totalArray);
			if (total > 100) {
		System.out.println("True");
			} else {
				System.out.println("False");
			}
				
		System.out.println(" ");
		
		//10
		
		System.out.println("10 - WAM that takes an array of double and returns the average of all elements in the array.");
		
		double[] averageElement = new double[7];
		averageElement[0] = 35;
		averageElement[1] = 44;
		averageElement[2] = 54;
		averageElement[3] = 57;
		averageElement[4] = 66;
		averageElement[5] = 68;
		averageElement[6] = 72;
		
		double example = ave(averageElement);
		double last = averageElement.length;
		
		System.out.println(example/last);
		
		System.out.println(" ");
		
		//11
		
		System.out.println("11 - WAM that takes two arrays of double and returns true if the AVG of the elements in the 1st array is greater than the AVG of the 2nd arrays.");
		
		double[] cars = new double[3];
		cars[0] = 2006.8;
		cars[1] = 2008.2;
		cars[2] = 2600.8;
		
		double[] trucks = new double[3];
		trucks[0] = 3805.88;
		trucks[1] = 3508.55;
		trucks[2] = 3085.85;
		
		double q = twin1(cars);
		double under = cars.length;
		double u = twin2(trucks);
		double under1 = trucks.length;
		
		if (q/under > u/under1) {
			System.out.println("True");
				} else {
					System.out.println("False");
				}
				
		System.out.println(" ");
		
		//12
		
		System.out.println("12 - WAM that takes a boolean and a double and returns true if it is hot ouside and if moneyInPocket is greater than 10.50.");
				
		boolean isHotOutside = true;
		double moneyInPocket = 9.50;
		boolean boughtDrink = willBuyDrink(isHotOutside, moneyInPocket);
		
			System.out.println(boughtDrink);
				
		
		System.out.println(" ");
		
		//13
		
		System.out.println("13 - Create a method of your own that solves a problem. In comments, write out what the method does and why you created it.");
		
		//Oakley, my youngest son, likes plain hamburgers from McDonalds. We have a high failure rate of them putting cheese 
		// on it anyway. If there isCheeseOnIt because of the high mcdonaldsFailureRate then hungrySon is true. If there is
		// not cheese on the burger, hungry son is false because he will eat the burger.
		
		boolean isCheeseOnIt = true;
		double mcdonaldsFailureRate = 85;
		boolean hungrySon = oakleyHatesCheese(isCheeseOnIt, mcdonaldsFailureRate);
		
			System.out.println(hungrySon);
		
		System.out.println(" ");
		
		System.out.println("End of Java weeks 3-4 Coding Assignment!");
				
	}
	
	//7
	public static String duplicateString(String word, int number) {
		String result = ""; 
			for (int e = 0; e < number; e++) {
			result += word;
		} return result;
	}
		
	//8
	public static String createFullName(String w, String u) {
		String fullName = w + " " + u;
		return fullName;
	}
	
	//9
	public static int validity(int[] numero) {
		int total = 0;
		for (int y = 0; y < numero.length; y++) {
			total += numero[y];
		}
		return total;
	}
	
	//10
	public static double ave(double[] averageElement) {
		double example = 0;
		for (int p = 0; p < averageElement.length; p++) {
			example += averageElement[p];
		}
		return example;
	}
	
	//11
	public static double twin1(double[] cars) {
		double q = 0;
		for (int r = 0; r < cars.length; r++) {
			q += cars[r];
		}
		return q;
	}
	public static double twin2(double[] trucks) {	
		double u = 0;
		for (int n = 0; n < trucks.length; n++) {
			u += trucks[n];
		}
		return u;
	}
	
	//12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		double loaded = 0;
		if (isHotOutside && moneyInPocket > 10.50) {
				return true;
				} else {
				return false;
				}
	}
	
	//13
	public static boolean oakleyHatesCheese(boolean isCheeseOnIt, double mcdonaldsFailureRate) {
		
		if (isCheeseOnIt && mcdonaldsFailureRate > 35) {
				return true;
				} else {
				return false;
				}
	}
	
	
}