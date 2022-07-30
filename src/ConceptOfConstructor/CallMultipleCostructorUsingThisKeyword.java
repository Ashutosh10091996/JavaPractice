package ConceptOfConstructor;

public class CallMultipleCostructorUsingThisKeyword {
	
	 public CallMultipleCostructorUsingThisKeyword()
	{
		this(50, 60);
		System.out.println("Inside the Default Constructor");
		
	}
	CallMultipleCostructorUsingThisKeyword(int a , int b )
	{
		System.out.println("Parameterized Constructor Called using this keyword :-"+ a + b);
	}

}
