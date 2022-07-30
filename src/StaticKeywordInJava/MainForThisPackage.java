package StaticKeywordInJava;

import ConceptOfConstructor.CallMultipleCostructorUsingThisKeyword;
import ConceptOfConstructor.UseOFthisKeywordInConstructor;

public class MainForThisPackage {

	int a = 100;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StaticKewordBasics statcKeyword = new StaticKewordBasics();
		statcKeyword.CollageDetails(1, "Arti");
		UseOFthisKeywordInConstructor constru = new UseOFthisKeywordInConstructor(12 , "AshutoshSingh " , "AvadhUniversity");
		CallMultipleCostructorUsingThisKeyword thisconstruct = new CallMultipleCostructorUsingThisKeyword();
	}

}
