public class Task2 {
    public static void func() {
        try {
            int[] arr = new int [3];
            arr[3] = 5;
            System.out.println("try сработал");
            System.exit(0);
        }catch (IndexOutOfBoundsException e){
            System.out.println("catch сработал");
            System.exit(0);
        }
        finally {
            System.out.println("finally сработал");
        }
    }
}
