public class User {
    String username;
    String password;

    Message[] messages = new Message[10];
    int count = 0;

    public void addMessage(String message,String username){
        if(count == message.length()){
            return;
        }else{
            Message emptymessage = new Message();
            emptymessage.setText(message);
        }
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
