package model;

public class ChatBot
{
	private String userName;
	private double userAge;
	
	
	public ChatBot()
	{
		
	}
	
	public ChatBot(String userName, String userAge)
	{
		this.userName = "unnamed user";
		this.userAge = -99;
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public double getUserAge()
	{
		return userAge;
	}
	
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	public void setUserAge(double userAge)
	{
		this.userAge = userAge;
	}
}
