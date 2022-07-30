package ConceptOfConstructor;

public class UseOFthisKeywordInConstructor
{
   int rollNumber; 
   String Name ;
   String CollageName;
   public UseOFthisKeywordInConstructor(int roll , String Name , String CollageName)
   {
	   this.rollNumber = roll ;
	   this.Name = Name ;
	   this.CollageName = CollageName;
	   System.out.printf(rollNumber + "\t"  ,  Name ,  CollageName);
   }
}
