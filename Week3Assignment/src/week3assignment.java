public class week3assignment {

	public static void main(String[] args) {
;
//#1 and #2
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93, 27};
			int firstAge = ages[0];
			int lastAge = ages[ages.length-1];
			System.out.println(lastAge - firstAge);
			int totalAges = ages.length;
			int sum = 0;
			for (int i = 0; i < ages.length; i++) {
				sum += ages[i];
			}
			double averageAge = ((double)sum / totalAges);
			System.out.println(averageAge);

//#3 int/string lastElement = array[array.length-1];
			
//#4 array[0];
			
//#5 and #6			
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; 
			int howManyLetters = 0;
			int totalNames = names.length;
			for (String i : names) {
				howManyLetters += i.length();
				}
			double averageLetters = ((double) howManyLetters / totalNames);
			System.out.println(averageLetters);
			
			for (String allNames : names) {
				System.out.print(allNames + " ");
			}
			System.out.println("\n");
			int totalLetters = 0; 
			for (String i : names) {
		int [] nameLengths = {i.length()};
			 for (int a : nameLengths) {
				System.out.println(a);
		 }	 for (int b = 0; b < nameLengths.length; b++) {
				totalLetters += nameLengths[b];
			}
				}
			System.out.println(totalLetters);
			System.out.println("");
			
//#7
		String word = "Hello";
		int wordLength = word.length();
		int n = 3;
		for (int i = 0; i < n; i++ ) {
			wordLength += n;
			System.out.println(word);
		}
		System.out.println("");
//#8
		String firstName = "first";
		String lastName  = "last";
		String fullName = (firstName + lastName);
		System.out.println(fullName);
		System.out.println("");

//#9
		int [] ints = {17, 27, 37, 34};
			int intTotal = 0; 
			for (int i = 0; i <ints.length; i++) {
				intTotal += ints[i];
			}
			System.out.println(intTotal);
			System.out.println("");
			
//#10
			
		double [] nums = {5, 10, 15, 20, 25};
			int amountOfNums = nums.length;
			int totalNums = 0;
			for (int i = 0; i < nums.length; i++) {
				totalNums += nums[i];
			}
			double averageNums = ((double) totalNums / amountOfNums);
			System.out.println(averageNums);
			System.out.println("");
			
//#11
		double [] array1 = {10, 20, 35, 45, 100};
			int amountIn1 = array1.length;
			int totalArray1 = 0;
			for (int i = 0; i < array1.length; i++) {
				totalArray1 += array1[i];
			}
			double averageArray1 = ((double) totalArray1 / amountIn1);
			
		double [] array2 = {21, 27, 32, 45, 55};
			int amountIn2 = array2.length;
			int totalArray2 = 0;
			for (int i = 0; i < array2.length; i++) {
				totalArray2 += array2[i];
			}
			double averageArray2 = ((double) totalArray2 / amountIn2);
		if (averageArray1 > averageArray2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		System.out.println("");
		
		
//#12
		boolean willBuyDrink;
		boolean isHotOutside = true;
		double moneyInPocket = 11;
		if (isHotOutside == true && moneyInPocket > 10.50) {
			willBuyDrink = true;
		}
		System.out.println("");
		
//#13
		
		boolean isTimeForHomework;
		String [] day = {"Monday" , "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		for (int i = 0; i < day.length; i++) {
			if (day[i] == "Monday" || day[i] == "Tuesday" || day[i] == "Wednesday" || day[i] == "Thursday") {
				isTimeForHomework = true;
			} else {
				isTimeForHomework = false;
			}
			System.out.println("It is " + day[i] + " do I have homework? " + isTimeForHomework);
	
		}
//a way to check if it's M-Thurs to do homework or Fri-Sun to relax		
			}	
}



			
			
