package ConceptOfConstructor;

public class ConstructorClass
{
	
	//This is a default constructor and non needed to implement 
 ConstructorClass()
	{
		System.out.println("Cunstructor Run By Default");
		
		//This can be use to call a function internally using a custructor
		addtwonumber(10, 20);
	}
	
	//This is the parameterized constructer and this can be created in a class 
	ConstructorClass(int value)
	{
		System.out.println(" Parameterized constructor called " + value);
	}
	
	ConstructorClass(int a , int b ,int c)
	{
		int D= a+b+c;
		
		System.out.println("Sum of numbers using the consrtructor " + D);
	}
	
	public void addtwonumber(int a , int b )
	{
		int c = a+b ;
		System.out.println("Internally Sum function is called and result is :-"+c);
	}
}
