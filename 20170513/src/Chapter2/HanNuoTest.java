package Chapter2;

import java.util.Scanner;

public class HanNuoTest {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    HanNuoTest t = new HanNuoTest();
	    //��ȡ�ܵĲ���
	    System.out.println("��Ҫ�ƶ����ܲ���Ϊ:" +t.getSum(n));
	    //��ȡ�ƶ��Ĺ���
	    t.hm(n,'a','b','c');
	  }
	  //��ȡ�ܲ���
	  public int getSum(int n){
	    if(n == 1) 
	      return 1;
	    return 2 * getSum(n-1) +1 ;
	  }
	 
	  //��ȡ�ƶ��Ĺ���
	  public void hm(int m,char a,char b,char c){
	    if(m == 1)
	      move(a,c);
	    hm(m-1,a,c,b);
	    move(a,c);
	    hm(m-1,b,a,c);
	  }
	 
	  //���һ���ƶ��Ĺ���
	  public void move(char a,char c){
	    System.out.print(a + "-->" + c + "  ");

	}

}