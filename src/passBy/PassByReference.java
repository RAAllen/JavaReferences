package passBy;

class PassByReference {	

	public static void main(String[] args) {	
		TestObject original = new TestObject();
		System.out.println("The value held inside the object before reassignment: " + original.getString());
		original.setString("A new string, different from the original.");
		System.out.println("The value held inside the object after leaving the method call: " + original.getString());
	}

}



