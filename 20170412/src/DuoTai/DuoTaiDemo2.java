




package DuoTai;

public class DuoTaiDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		毕老师  x = new 毕老师();
//		x.讲课();
//		x.看电影();
		
		毕姥爷 x = new 毕老师();
		x.讲课();
		x.钓鱼();
		
		
		毕老师  y  = (毕老师)x;
		y.看电影();
	}

}
