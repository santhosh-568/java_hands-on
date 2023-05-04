package cg.model;

public class TestStudent {

	public static void main(String[] args) {

			      Student alan = new Student("alan Teck", "capgemini");
			      System.out.println(alan);  
                  alan.setAddress("3-6-680 subashnagar");
			      System.out.println(alan);
			  
			      System.out.println(alan.getName());
			      System.out.println(alan.getAddress());
			      alan.addCourseGrade("gitandgithub", 89);
			      alan.addCourseGrade("mongodb", 57);
			      alan.addCourseGrade("spring", 96);
			      alan.printGrades();
	
			      System.out.printf("The average grade is %.2f%n", alan.getAverageGrade());
			   
			   }
			

	}


