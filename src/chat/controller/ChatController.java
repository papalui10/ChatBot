package chat.controller;

import javax.swing.JOptionPane;

import chat.model.ChatBot;


public class ChatController
{
	private ChatBot user;
	
	private ChatBot simplebot;
	
	public ChatController()
	{
		simplebot = new ChatBot();
		
	}
	
	public void start()
	{
		String userInput = "";
		while(!userInput.equals("quit"))
		{
			userInput = interactWithChatbot(userInput);
		}
	}
	
	public String interactWithChatbot(String text)
	{
		userInput = JOptionPane.showInputDialog("what is your name?");
		if(!userInput.equals("quit"))
		
		String output = "";
		String userResponse = JOptionPane.showInputDialog("What is your name?");
		output = user.processText(userResponse);
		return output;
	}

	private String respond(String userInput)
	{
		if(userInput.equals( user.getUserName() ))
		{
			JOptionPane.showMessageDialog(null, user.getUserName());
		}
		
		return null;
	}
		

public ChatBot getChatbot()
{
	return simplebot;
	}

}

