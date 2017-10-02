
public class Main {
	public static void main(String[] args) {
		User user = new User();
		user.setName("Autumn");
		user.setPassword("da");
		user.getPhoto();
		Skype u = new Skype();
		
		
		u.setMessage("Hi", "Tony", "Autumn");
		
		u.setOnline(true);

		u.setMessage("How are you?", "Tony", "Autumn");
		
		u.setDoNotDisturb(true);
		u.setMessage("Are you busy?", "Tony", "Autumn");
				
		u.findMessage(user, 3);
	}
}
