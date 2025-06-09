package day1;

public class Recursion {
	public static int name(int num) {
		if(num<=1) {
			return num;
		}
		return name(num-1)+name(num+1);
	}
	public static void main(String []args) {
		System.out.println(name(5));
	}

}
