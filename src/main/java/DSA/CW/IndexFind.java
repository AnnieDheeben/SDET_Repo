package DSA.CW;

public class IndexFind {
	public static void main(String args[]) {
		int size =16;
		String key = "SizeOfTheArray";
		int hashValue = key.hashCode();
		int boxedVal = hashValue>>>16;
		System.out.println((size-1) & boxedVal);
	}

}
