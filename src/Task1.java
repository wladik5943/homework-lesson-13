import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static boolean authorization(String login,String password,String confPassword) throws WrongPasswordException, WrongLoginException {

        String logChek = "^[^\\s\\d]{0,20}$";
        String passChek1 = "^\\S{0,20}$";
        String passChek2 = "\\d+";
        Pattern logPat = Pattern.compile(logChek);
        Pattern passPat1 = Pattern.compile(passChek1);
        Pattern passPat2 = Pattern.compile(passChek2);
        Matcher passMatch1 = passPat1.matcher(password);
        Matcher logMatch = logPat.matcher(login);
        String pass = "";
        if(passMatch1.find()){
            pass = passMatch1.group();
        }
        else{
            throw new WrongPasswordException(password);
        }
        Matcher passMatch2 = passPat2.matcher(pass);
        if(logMatch.find() && passMatch2.find()){
            System.out.println("данные введены верно");
            return true;
        }
        else if(!logMatch.find()){
            throw new WrongLoginException(login);
        }
        else{
            throw new WrongPasswordException(password);
        }
    }
}
