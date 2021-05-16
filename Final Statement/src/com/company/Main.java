package com.company;

public class Main {

    public static void main(String[] args) {
	SomeClass one = new SomeClass("one");
	SomeClass two= new SomeClass("two");
	SomeClass three= new SomeClass("Three");
		System.out.println(one.getInstanceNumber());
		System.out.println(two.getInstanceNumber());
		System.out.println(three.getInstanceNumber());
		System.out.println(Math.PI);


		int password= 654322;
		Password password1=new ExtendedPassword(password);
		password1.storePassword();
		password1.letMeIn(1);
		password1.letMeIn(131313);
		password1.letMeIn(6545);
		password1.letMeIn(1);
		password1.letMeIn(654322);
		System.out.println("Main method called");
		SIBTest test = new SIBTest();
		test.someMethod();
		System.out.println("Owner is " + SIBTest.owner);

	}
}
