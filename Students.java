package week3.day1assignment;

public class Students {

	public void getStudentInfo(String id) {

		System.out.println("The Id is : "+id);
	}

	public void getStudentInfo(String id, String name) {

		System.out.print("The Id is : "+id);
	
		System.out.println(" The Name of the Student is : "+name);
	}
	
	public void getStudentInfo(String email, long phnnm) {

		System.out.print("The emailId is : "+email);
	
		System.out.print(" The phone number of the Student is : "+phnnm);
	}
	
	
	public static void main(String[] args) {
		
		Students st = new Students();
		
		st.getStudentInfo("DE1254");
		
		st.getStudentInfo("DE1254", "Ganesh");
		
		st.getStudentInfo("hfjsdsj@gmail.com",9876543210l);
		
	}
}
