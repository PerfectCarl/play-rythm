package controllers;

import models.Message;
import play.mvc.Controller;

public class Api extends Controller {

	public static void createMessage() {
		Message message = new Message("End of ", "the world");
		renderJSON(message);
	}

	private static Message getMessage() {
		Message message = new Message("End of ", "the world");
		return message;
	}

	private static String getString() {
		return null;
	}

}
