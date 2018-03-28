package objectEquality;

public class ObjectIdentityEquality {
	
	public static void main(String[] args) {
		TestObject firstObject = new TestObject("This is referencing an object.");
		TestObject secondObject = firstObject;
		TestObject thirdObject = new TestObject("This is referencing an object.");
		boolean firstVsSecond = firstObject == secondObject;
		System.out.println("The first object is equal to the second object: " + firstVsSecond);
		boolean firstVsThird = firstObject == thirdObject;
		System.out.println("The first object is equal to the third object: " + firstVsThird);
		boolean secondVsThird = secondObject == thirdObject;
		System.out.println("The second object is equal to the third object: " + secondVsThird);	
	}
}
