package DSA.CW;

import org.junit.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class StringFunctions {
	//@Test
	public void funcString() {
		//append
		String name = "Annie";
		StringBuilder sb = new StringBuilder("Annie");
		sb.append("Soundari");
		System.out.println(sb);
		//chained append
		System.out.println(sb.append(".").append("M"));
		//insert
		System.out.println(sb.insert(5, " "));
		//delete
		System.out.println(sb.delete(5, 6));
		System.out.println(sb.insert(5, '-'));
		sb.setCharAt(5, ' ');
		System.out.println(sb);
		sb.replace(6, 14, "Dheeben");
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder("Annie Dheeben.M");
		//System.out.println(sb1.equals(sb));
		System.out.println(sb.toString().equals(sb1.toString()));
		
		String ip = "1.1.1.1";
		String s1 = "";
		String op = ip.replaceAll("\\.", "[.]");
		System.out.println(op);
		
		for(int i=0;i<ip.length();i++) {
			char ch = ip.charAt(i);
			if(ch =='.'){	
				s1 = s1 + "[.]";
			}
			else {
				s1 = s1 + ch;
			}
		}
		
		System.out.println(s1);	
		                                 
	}
}
	
	class Student{
		int age;
		int rollno;
		Student(int age, int rollno){
			this.age = age;
			this.rollno = rollno;
		}
		
		private static void changeAge(int age) {
			age =20;
			System.out.println(age);
		}
		
		private static void changeRollno(int rollno) {
			rollno = 301;
			System.out.println(rollno);
		}

	public static void main(String[] args) {
		int age = 10;
		int rollno = 101;
		
		Student s = new Student(age, rollno);
		System.out.println(s.age);
		changeAge(age);
		System.out.println(s.age);
	}
	}

