package finally_keybord;

public class example2 {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("finally b = " + b);
            }
            b--;
        }
    }
}
