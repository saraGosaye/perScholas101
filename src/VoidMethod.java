public class VoidMethod {
    public static void main(String[] args){
      greet("Sara");
      greet("John");
    }

    //Method that returns empty value
    public static void greet(String name){
        System.out.println("Hello: " + name);
    }
}
