package GitDe;

public class GitDsample2 {
	
	String username;
	String password;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GitDsample2 t1=new GitDsample2();
		t1.loginpage("amruta","abc123");
		System.out.println(t1.username+ " "+t1.password);

	}
	
	public void loginpage(String username, String password)
	{
		
		this.username=username;
		this.password=password;
		
	}

}
