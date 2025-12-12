package basics;

public class Forloop3 {

	public static void main(String[] args) {
	int num=1234;
	int count=0;
	for( ; num>0;num=num/10) {
		count++;
		System.out.println("digit="+count);
	}

	}

}
