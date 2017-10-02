
public class User {
	String name;
	String password;
	String[][] photo = new String[5][5];
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String[][] getPhoto() {
		setPhoto();
		for (int i = 0; i < photo.length; i++) {
			for (int j = 0; j < photo.length; j++) {
				System.out.print(photo[i][j]);
			}
			System.out.println("");
		}
		return photo;
	}
	public void setPhoto() {
		for (int i = 0; i < photo.length; i++) {
			for (int j = 0; j < photo.length; j++) {
				if (i == 0 && j % 2 > 0) {
					photo[i][j] = "0";
				} else if (i == 1  && j == 2) {
					photo[i][j] = "|";
				} else if ((i == 2 && (j == 0 || j == 4)) || (i == 3 && (j == 1 || j == 3))) {
					photo[i][j] = "*";
				} else {
					photo[i][j] = " ";
				}
			}
		}
	}
}
