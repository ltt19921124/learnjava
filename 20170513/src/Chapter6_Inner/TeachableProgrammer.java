package Chapter6_Inner;

public class TeachableProgrammer extends Programmer implements Teachable{
	
	public void work() {
		System.out.println(super.name + "教师在讲台上讲解...");
	}
}
