package Chapter2;

class Hanoi { 
    
	  public static void main(String[] args) {
	      
	    Hanoi hanoi = new Hanoi(); 
	    hanoi.move(3, 'A', 'B', 'C'); 
	  } 
	    
	  /** 
	   * @author 
	   * @param n 盘子数目 
	   * @param from 起始柱子 
	   * @param temp 中间柱子 
	   * @param to 目标柱子 
	   */
	  public void move(int n, char from, char temp, char to) { 
	    if(n == 1) { 
	      System.out.println("Move 1 plate from " + from + " to " + to); 
	    } else { 
	      move(n-1, from, to, temp); 
	      move(1, from, temp, to); 
	      move(n-1, temp, from, to); 
	    } 
	  } 
	}

