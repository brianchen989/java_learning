import java.util.Random;
import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int target = random.nextInt(101);
    int guess = -1;
    do{
        System.out.println("guess 1~100");
        guess = scanner.nextInt();
        if(guess>=0&&guess<=100){
            if(guess>target){
                System.out.println("smaller");
            }
            else if(guess<target){
                System.out.println("bigger");
            }
            else{
                break;
            }
        }
        else{
            System.out.println("enter 1~100");
        }
    }while(guess!=target);
    System.out.println("victory");

    
}