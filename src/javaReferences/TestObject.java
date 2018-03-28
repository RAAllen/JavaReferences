package javaReferences;

class TestObject {	
	private String string = "The original string value.";
	
	public TestObject() {
	}

	public TestObject(String string) {
		super();
		this.string = string;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		System.out.println("The new value passed in that will replace the original value: " + string);
		this.string = string;
		System.out.println("The value after reassignment, inside the method call: " + this.string);
	}

}
