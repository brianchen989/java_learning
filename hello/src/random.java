//generate random num
import java.util.Random;
void main() {
    Random random = new Random();
    int x = random.nextInt();
    int y = random.nextInt(3);//0~2
    int z = random.nextInt(3)+1;//1~3
    double a = random.nextDouble(3);
    boolean b = random.nextBoolean();
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    System.out.println(a);
    System.out.println(b);
}