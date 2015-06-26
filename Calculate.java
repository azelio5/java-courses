public class Calculate{
	public static void main(String[] arg){
		System.out.println("Hello");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int summ = first + second;
		int minus = first - second;
		int decart = first * second;
		int devision = first / second;
		int pow = (int)Math.pow(first, second);
		
		System.out.println(summ);
		System.out.println(minus);
		System.out.println(decart);
		System.out.println(devision);
		System.out.println(pow);
		
		
	}
}