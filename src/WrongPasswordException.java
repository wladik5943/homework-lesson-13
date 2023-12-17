public class WrongPasswordException extends Exception{
boolean flag = false;
String password;

    public WrongPasswordException(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
