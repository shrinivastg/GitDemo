package GitDe;

public class GitDsample {
	
	String username;
	String password;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GitDsample t1=new GitDsample();
		t1.loginpage("shrinivas","abc123");
		System.out.println(t1.username+ " "+t1.password);

	}
	
	public void loginpage(String username, String password)
	{
		
		this.username=username;
		this.password=password;
		
	}

}
