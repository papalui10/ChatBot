package chat.controller;

import javax.swing.JOptionPane;

import chat.model.Chatbot;


public class ChatController
{
	private Chatbot user;
	
	private Chatbot simplebot;
	
	public ChatController()
	{
		simplebot = new Chatbot();
		
	}
	
	public void start()
	{
		
	}
	private String respond(String userInput)
	{
		if(userInput.equals( user.getUserName() ))
		{
			JOptionPane.showMessageDialog(null, user.getUserName());
		}
		
		return null;
	}
		

public Chatbot getChatbot()
{
	return simplebot;
	}
public void getContent();
{
	
}

