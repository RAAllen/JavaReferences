package javaReferences;

class PassByReference {	

	public static void main(String[] args) {		
		String originalString = "The original String.";
		System.out.println("Before reassignment: " + originalString);
		String newString = originalString;
		System.out.println("The value of the new object: " + newString);
		originalString = "It's different now.";
		System.out.println("The value of the original string after reassignment: " + originalString);
		System.out.println("The value of the new string after reassignment: " + newString);
	}

}
