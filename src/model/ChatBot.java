package model;

import java.util.ArrayList;

public class ChatBot
{
	private ArrayList<String> spookyList;
	private ArrayList<String> responseList;
	
	private String content;
	private String joke;
	private String currentUser;
	
	private String userName;
	private double userAge;
	
	
	public ChatBot()
	{
		this.joke = "What did the father tomatoe say the baby tomato?";
		this.content = new String("lame content");
		this.currentUser = new String("This is the default user :( not very cash money of you.");
		
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		
		buildTheLists();
	}
	//helper methods are private
	private void buildTheLists()
	{
		responseList.add("Hello! How are you?");
		responseList.add("Goodbye - no more talking!");
		responseList.add("What is youre age?");
		responseList.add("What is your social security number?");
		responseList.add("Yeet");
		responseList.add("Ay whats poppin b");
		responseList.add("NAHHHHHHHHHHHHHHHHHHH");
		
		spookyList.add("She's here");
		spookyList.add("Behind you, ...Michael Myers!");
		spookyList.add("Halloween ...more like LAMEowleen!");
		spookyList.add("How are your grades?");
		spookyList.add("...       AHHHHHHHHHH");
		spookyList.add("Downloading Virus.");
		spookyList.add("The reason your life is falling apart is because of you and now one elses fault.");
		
	}
	
	public String processText(String userText)
	{
		String answer = "";
		
		answer += "You said: " + userText;
		
		return answer;
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
