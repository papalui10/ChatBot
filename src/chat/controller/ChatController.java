package chat.controller;

import javax.swing.JOptionPane;
import chat.model.Chatbot;
import chat.view.ChatFrame;

import chat.model.Chatbot;
import java.util.ArrayList;


public class ChatController
{
	private Chatbot bot;
	private ChatFrame appFrame;
	
	public ChatController()
	{
		bot = new Chatbot("my chatbot");
		appFrame = new ChatFrame(this);
		
	}
	
	public void start()
	{
		/*
		String userInput = "";
		
		while(!userInput.equals("quit"))
		{
			userInput = interactWithChatbot(userInput);
		}
		*/
	}

	public String interactWithChatbot(String text)
	{
		String output = "";
		output += bot.processText(text);
		return output;
		
		/*
		if(userInput == null)
		{
			return "you entered null";
		}
		else
		{
			userInput = JOptionPane.showInputDialog("What is your name?");
			if(!userInput.equals("quit"))
			{
				JOptionPane.showMessageDialog(null, bot.processText(userInput));
			}
			else if(userInput.equals("quit"))
			{
				JOptionPane.showMessageDialog(null,  "Goodbye ");
			}
			
			return userInput;
			*/
		
	}
		
	public ArrayList<String> useChatbotCheckers(String word)
	{
		return bot.getSpookyList();
	}
	
	public void handleErrors(Exception error)
	{
		JOptionPane.showMessageDialog(appFrame, error.getMessage());
	}
		

	public Chatbot getChatbot()
	{
		return bot;
		}
	}
//public void getContent();

	


