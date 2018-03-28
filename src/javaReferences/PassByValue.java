package javaReferences;

class PassByValue {
	
	public static String originalString = "The original string.";

	public static void main(String[] args) {		
		System.out.println("Value of originalString before call: " + originalString);
		referenceTracker(originalString);
		System.out.println("Value of originalString after call: " + originalString);
	}
	
	public static void referenceTracker(String stringWeAreTryingToChange) {
		System.out.println("Value of stringWeAreTryingToChange before reassignment: " + stringWeAreTryingToChange);
		stringWeAreTryingToChange = "A new string, different from the original.";
		System.out.println("Value of stringWeAreTryingToChange after reassignment: " + stringWeAreTryingToChange);
		System.out.println("Value of originalString after reassignment, during the call: " + originalString);
	}

}
