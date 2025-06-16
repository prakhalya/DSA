package day1;

public class Stackop {
	int[] mystack=new int[5];
	int top=-1;
	public void push(int data) {
		if(top==4) {
			System.out.println("stack overflow");
		}
		else {
			mystack[++top]=data;
		}
		
	}
	public void display() {
		for(int i=0;i<mystack.length;i++) {
			System.out.println(mystack[i]);
		}
	}
	public void pop() {
		if(top==-1) {
			System.out.println("stack underflow");
		}
		else {
			int poppedValue = mystack[top];
			mystack[top] = 0;
			top--;
			System.out.println("Popped value: " + poppedValue);
		}
	}
	public static void main(String []args) {
		Stackop sc=new Stackop();
		sc.push(10);
		sc.push(59);
		sc.push(70);
		sc.push(67);
		sc.push(69);
		sc.pop();
		sc.pop();
		sc.display();
	}
}
