package String;


/*
 * 练习：
 * 1，给定一个字符串数组，按照字典顺序排序
 *   {"nba","abc","cba","zz","qq","haha"}
 *    思路：
 *    1,对数组排序，用可以用选择，冒泡
 *    2，for循环嵌套比较以及换位
 * 	  3，以前是整数，现在是字符串对象，怎么操作？
 * 		用字符串比较的功能
 * 2，一个子串在字符串出现的次数
 * 	
 * 
 * */

public class StringTest {
	
	public static void main(String[] args) {
		String[] arr = {"nba","abc","cba","zz","qq","haha"};
		
		printArray(arr);
		
		sortString(arr);
		
		printArray(arr);
		
	}

	private static void sortString(String[] arr) {
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i].compareTo(arr[j]) > 0){
					swap(arr,i,j);
				}
			}
			
		}
	}

	private static void swap(String[] arr, int i, int j) {
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void printArray(String[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if(i != arr.length - 1)
				System.out.print(arr[i] + ",");
			else
				System.out.println(arr[i] + "]");
		}
	}
	
	
	
}




