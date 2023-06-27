package testcase;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			
		
		int i=10;
				System.out.println("Before division");
		System.out.println(i/0);
		System.out.println("After Division");
		
		}catch(Throwable t) {
			System.out.println(t.getCause());
			System.out.println(t.getMessage());
			System.out.println(t.getStackTrace());
			
		}
	}

}
