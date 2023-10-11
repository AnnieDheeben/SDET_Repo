package DSA.CW;

public class finderrors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int a = 5/0;
			}
			catch(Exception e){
			System.out.println("catch1");
			}
			/*catch(ArithmeticException e){
		System.out.println("catch2");
			} */finally{
			System.out.println("finally");
			}
		
		
		int b=10;
		System.out.println(++b*++b);
	}

}
