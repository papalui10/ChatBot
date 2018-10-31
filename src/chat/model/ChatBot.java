package chat.model;

import java.util.ArrayList;

public class Chatbot
{
	private ArrayList<String> spookyList;
	private ArrayList<String> responseList;
	
	private String content;
	private String joke;
	private String currentUser;
	
	public Chatbot()
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
		responseList.add("Hello!");
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
		spookyList.add("Halloween");
		
	}
	
	public String processText(String userText)
	{
		String answer = "You said: " + userText + "\n" + "Chatbot says: ";
		
		if(userText == null)
		{
			answer = "You said " + userText + "\n" + "Chatbot says: ";
		}
		else if(userText.equals(getContent()))
		{
			answer = answer + "You said the special words";
		}
		
		return answer;
	}
	
	public String getContent()
	{
		return content;
	}
	
	public String getjoke()
	{
		return joke;
	}
	
	public ArrayList<String> getSpookyList()
	{
		return spookyList;
	}
	
	public ArrayList<String> getResponseList()
	{
		return responseList;
	}
	
	public String getCurrentUser()
	{
		return currentUser;
	}
	
	public boolean legitimacyChecker(String input)
	{
		boolean isValid = true;
		
		if(input == null)
		{
			isValid = false;
		}
		else if(input.length() < 2)
		{
			isValid = false;
		}
		else if (input.contains("sdf") || input.contains("jkl") || input.contains("cvb"))
		{
			isValid = false;
		}
			
		return isValid; 
	}
	
	public boolean spookyChecker(String input)
	{	
		if(input.contains("Halloween"))
		{
			return true;
		}
		for(String spookyString:spookyList)
		{
			if(input.contains(spookyString))
			{
				return true;
			}
		}
		return false;
	}
}
