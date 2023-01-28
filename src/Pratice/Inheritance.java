package Pratice;
//Class Variables: we can create a varibales by using 3 different types 
/*1.By using reference varibale
  2.byusing method
  3.  */
public class Inheritance {
public static void main(String[] args )  {
	AssignmentInheritance ai=new AssignmentInheritance();
	ai.eid=266;
	ai.ename="Amol Bhutkar";
	ai.esalary=45000.00;
	ai.edeptno=05;
	ai.edeptName="Signature";
	ai.display();
	
	AssignmentInheritance ai1=new AssignmentInheritance();
	ai1.eid=267;
	ai1.ename="Deeptibhutkar";
	ai1.esalary=5000.00;
	ai1.edeptName="testing";
	ai1.edeptno=3;
	
	ai1.display();
}

}
