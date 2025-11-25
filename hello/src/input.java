//get input
import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("input your name");
    String name = scanner.nextLine();// get string
    System.out.println("input your age");
    int age = scanner.nextInt();//get int
    //Double height = scanner.nextDouble();//get double
    //System.out.println( height );
    System.out.println("Hi(>_<) " + name + "you are " + age + 1);
}