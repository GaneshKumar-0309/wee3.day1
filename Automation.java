package week3.day1assignment;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public void Selenium() {
		// TODO Auto-generated method stub
		
		System.out.println("The tool is selenium");
	}

	public void Java() {
		// TODO Auto-generated method stub
		
		System.out.println("The language is java");

	}
	
	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("The language is ruby");

	}
	
	
	public static void main(String[] args) {
		
		
		Automation at = new Automation();
		
		at.Java();
		at.Selenium();
		at.python();
		at.ruby();
		
	}

	

	
	
	
}
