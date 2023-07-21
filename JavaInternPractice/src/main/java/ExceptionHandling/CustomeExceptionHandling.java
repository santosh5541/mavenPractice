package ExceptionHandling;

public class CustomeExceptionHandling extends Exception {
    public CustomeExceptionHandling(String s){

        super(s);
    }

    public static void main(String[] args) {
        try{
           throw new CustomeExceptionHandling("It's a custome exception");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}
