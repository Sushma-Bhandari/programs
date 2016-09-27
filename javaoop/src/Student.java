
public class Student {
	static int iID;
	String sName;
	static String sCollegeName="BVBCET";
	
	Student(String sName){
		iID++;
		this.sName=sName;
		this.displayRecord();
	}
	
	void displayRecord(){
		System.out.println("Student ID:"+iID);
		System.out.println("Student Name:"+sName);
		System.out.println("College Name:"+sCollegeName);
		
		
	}
}
