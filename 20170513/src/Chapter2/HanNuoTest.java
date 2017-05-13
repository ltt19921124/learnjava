package Chapter2;

import java.util.Scanner;

public class HanNuoTest {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    HanNuoTest t = new HanNuoTest();
	    //获取总的步数
	    System.out.println("需要移动的总步数为:" +t.getSum(n));
	    //获取移动的过程
	    t.hm(n,'a','b','c');
	  }
	  //获取总步数
	  public int getSum(int n){
	    if(n == 1) 
	      return 1;
	    return 2 * getSum(n-1) +1 ;
	  }
	 
	  //获取移动的过程
	  public void hm(int m,char a,char b,char c){
	    if(m == 1)
	      move(a,c);
	    hm(m-1,a,c,b);
	    move(a,c);
	    hm(m-1,b,a,c);
	  }
	 
	  //输出一次移动的过程
	  public void move(char a,char c){
	    System.out.print(a + "-->" + c + "  ");

	}

}
