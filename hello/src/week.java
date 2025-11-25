import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("day of week today");
    int day = scanner.nextInt();
    // can not judge float or double
    switch (day){
        case 1:
            System.out.println("mon");
            break;
        case 2:
            System.out.println("tue");
            break;
        case 3:
            System.out.println("wed");
            break;
        case 4:
            System.out.println("thu");
            break;
        case 5:
            System.out.println("fri");
            break;
        case 6:
            System.out.println("sat");
            break;
        case 7:
            System.out.println("sun");
            break;
        default:
            System.out.println("input 1-7");
            break;
    }
    
}