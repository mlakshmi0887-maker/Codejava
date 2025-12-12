package basics;

public class Forloop2 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=5;i++) {
			int fac=fac(i);
			System.out.println(i);
		}

	}
	static int fac(int x) {
		int result=1;
		for(int i=1;i<=x;i++) {
			result=result*i;
		}
		return result;
			
		}
		
	}


