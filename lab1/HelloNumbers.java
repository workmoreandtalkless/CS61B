public class HelloNumbers{
	public static int max(int [] m){
		int i=0;
		int sum=0;

		while(i<m.length){
			sum+=a[i];
			i++;
		}
		return sum;
	}
	public static void main(String[] args){
		int [] numbers = new int[]{9,2,15,2,22,10,6};
		System.out.print(max(numbers));
	}	

}