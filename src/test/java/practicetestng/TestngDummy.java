package practicetestng;

import org.testng.annotations.Test;

public class TestngDummy
{
	@Test(priority=1)
	public void openbrowser()
	{
		System.out.println("launch browser");
	}
	
	@Test(priority=2)
	public void login() 
	{
		System.out.println("do login");
	}
	
	@Test(priority=3)
	public void sendMail()
	{
		System.out.println("send a mail");
	}
	@Test(priority=4)
	public void close()
	{
		System.out.println(" browser close");
	}
}
