package chat.model;

import java.util.ArrayList;

public class Chatbot
{
	private ArrayList<String> spookyList;
	private ArrayList<String> responseList;
	
	private String content;
	private String joke;
	private String currentUser;
	
	public Chatbot(String content)
	{
		this.content =(content);
	}
	
	public Chatbot()
	{
		this.joke = "What did the father tomatoe say the baby tomato?";
		this.content = new String("some content");
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
		responseList.add("Josh sucks at chess");
		responseList.add("Emi is weird");
		responseList.add("Alex looks good in glasses");
		responseList.add("Jacob is looking hella socially awkard.");
		responseList.add("Alex lost to josh in chess, almost 3 times");
		responseList.add("Josh got a green bar");
		responseList.add("How is no nut november going?");
		responseList.add("You're cute!");
		responseList.add("Cafe rio is a good place");
		
		spookyList.add("Halloween");
		spookyList.add("She's here Halloween");
		spookyList.add("Behind you, ...Michael Myers! Halloween");
		spookyList.add("Halloween ...more like LAMEowleen! Halloween");
		spookyList.add("How are your grades? Halloween");
		spookyList.add("...       AHHHHHHHHHH Halloween");
		spookyList.add("Downloading Virus. Halloween");
		spookyList.add("The reason your life is falling apart is because of you and now one elses fault. Halloween");
		spookyList.add("OOOHAHHAHHA Halloween");
		spookyList.add("Crack Cocaine Halloween");
		spookyList.add("I know your address Halloween");
		
	}
	
	public String processText(String userText)
	{
		String answer = "";
		
		if (!legitimacyChecker(userText))
		{
			answer += "You really should not send null\n";
		}
		else
		{
			answer += "You said: " + userText + "\n";
			
			if (contentChecker(userText))
			{
				answer += "You said the special words. \n";
			}
			int randomIndex = (int) (responseList.size() * Math.random());
			answer += "Chatbot says: " + responseList.get(randomIndex) + "\n";
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
	
	public boolean contentChecker(String contentCheck)
	{
		if(contentCheck.contains("text"))
		{
			return false;
		}
		else
		    return true;
	}
}
