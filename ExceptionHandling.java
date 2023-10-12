
class ExceptionHandling {
    public static void main (String[] args) {
      int a=5;
      int b=4;
        try{
          System.out.println(a/b);
        }
      catch(ArithmeticException e){
        System.out.println("exception in try block");
      }
    }
}