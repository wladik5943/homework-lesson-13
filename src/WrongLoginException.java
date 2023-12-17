public class WrongLoginException extends Exception{
boolean flag = false;
String login;

    public String getLogin() {
        return login;
    }

    public WrongLoginException(String login) {
        this.login = login;
    }
}
