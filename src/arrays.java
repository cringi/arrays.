import java.util.Random;
public class arrays {
    public static void main(String[] args) {
        Random random = new Random();
        int[] list = new int[5];

        for (int x=0;x < 5;x++) {
            int number;
            number = random.nextInt(98) + 1;
            list[x] = number;
        }
        System.out.print("Your numbers: ");
        for (int x=0;x < list.length;x++) {
            System.out.printf("%d ", list[x]);
        }
    }
}
