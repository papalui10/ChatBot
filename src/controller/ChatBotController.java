package controller;

import javax.swing.JOptionPane;
import model.ChatBot;


public class ChatBotController
{
	private ChatBot user;
	
	public ChatBotController()
	{
		user = new ChatBot();
	}
	
	public void start()
	{
		String userInput = "";
		while(!userInput.equals("quit"))
		{
			userInput = JOptionPane.showInputDialog("What is your name?");
			if(!userInput.equals("quit"))
			{
			user.setUserName(userInput);
			respond(user.getUserName());
			}
			else if(userInput.equals("quit"))
			{
				JOptionPane.showMessageDialog(null, "Goodbye " + user.getUserName());
			}
		}
	}
	
	public String respond(String userInput)
	{
		if(userInput.equals( user.getUserName() ))
		{
			JOptionPane.showMessageDialog(null, "Hello " + user.getUserName());
		}
		
		return null;
	}

}
