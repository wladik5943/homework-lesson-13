public class Main {
    public static void main(String[] args) {
    boolean flag;
        try {
            flag = Task1.authorization("fdnsj kf","fidf4ifd4","fidf4ifd4");
        }catch (WrongLoginException e){
            System.out.println("логин " + e.getLogin() + " не подходит");
            flag = false;
        }catch (WrongPasswordException e){
            System.out.println("пароль " + e.getPassword() + " не подходит");
            flag = false;
        }


        Task2.func();
    }
}