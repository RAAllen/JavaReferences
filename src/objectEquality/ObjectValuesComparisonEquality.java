package objectEquality;

public class ObjectValuesComparisonEquality {

	public static void main(String[] args) {
		String firstString = new String("This is a string.");
		String secondString = firstString;
		String thirdString = new String("This is a string.");
		boolean firstVsSecond = firstString.equals(secondString);
		System.out.println("The string inside the first object equals the string inside the second object: " + firstVsSecond);
		boolean firstVsThird = firstString.equals(thirdString);
		System.out.println("The string inside the first object equals the string inside the third object: " + firstVsThird);
		boolean secondVsThird = secondString.equals(thirdString);
		System.out.println("The string inside the second object equals the string inside the third object: " + secondVsThird);
	}

}
