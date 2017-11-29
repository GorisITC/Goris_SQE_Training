
public class Skype {
	String[] messages;
	String message;
	String[] newMessage;
	String sender;
	String getter;
	int mcount = 0;
	boolean online = false;
	boolean doNotDisturb = false;

	public String[] findMessage(User user, int a) {
		System.out.println(sender + " : " + messages[a-1]);
		return messages;
	}
	
	public void setMessage(String message,  String sender, String getter) {
		mcount+= 1;
		this.messages = new String[mcount];
		for (int i = 0; i < messages.length; i++) {
			if (i < mcount - 1 && mcount != 1) {
				this.messages[i] = newMessage[i];
			} else if (i == mcount - 1) {
				this.messages[mcount - 1] = message;
			}
		}
		newMessage = new String[mcount];
		newMessage = this.messages;
		this.sender = sender;
		this.message = message;
		getMessage(this.sender, this.message);
	}
	public boolean isOnline() {
		return online;
	}
	public void setOnline(boolean online) {
		this.online = online;
	}
	public boolean isDoNotDisturb() {
		return doNotDisturb;
	}
	public void setDoNotDisturb(boolean doNotDisturb) {
		this.doNotDisturb = doNotDisturb;
	}
	
	public void getMessage(String sender, String message) {
		if (isOnline() == true && isDoNotDisturb() == false) {
			System.out.println(sender + " : " + message);
		} else if (isOnline() == false) {
			System.out.println("I am not online now. I will write your message later.");
		} else if (isOnline() == true && doNotDisturb == true) {
			System.out.println("I am busy now. Please write later.");
		}
	}
}
