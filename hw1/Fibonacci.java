public class Fibonacci{
	public static int fib(int n){
		if(n==0) return 0;
		if(n==1) return 1;
		if(n==2) return 1;
		return fib(n-1)+fib(n-2);
	}
	public static int fib2(int n, int k, int f0,int f1){
		int counter=0;
		while(counter<n){
			int temp=f1;
			f1=f1+f0;
			counter++;
		}
		return f1;

	}
	public static void main(String[] args) {
		int n=6;
		System.out.println(fib(n));
		System.out.println(fib2(6,4,0,1));
	}
}