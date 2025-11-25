import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    //string turn into char陣列
    System.out.println("請輸入 Key (單一字串，例如: data):");
    String key = scanner.nextLine();
    char[] keys = key.toCharArray();
    int[] ascKeys = new int[keys.length];
    System.out.println("請輸入 Size (整數，例如: 4):");
    int size = scanner.nextInt();
    System.out.println("請輸入 Max Address (整數，例如: 1023):");
    int MaxAddr = scanner.nextInt();

    int i = 0;
    int addr = 0;
    while(i<keys.length){
        ascKeys[i] =(int) keys[i];
        System.out.println(ascKeys[i]);
        addr = addr + ascKeys[i];
        System.out.println(addr);
        addr = Integer.rotateRight(addr, 12);
        String b32 = String.format("%32s", Integer.toBinaryString(addr)).replace(' ', '0');
        System.out.println(b32);
        i++;
    }
    System.out.println((addr)%1023);

    //System.out.println(keys);
    //System.out.println(size);
}
