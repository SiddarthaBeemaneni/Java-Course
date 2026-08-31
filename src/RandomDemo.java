import java.util.Random;
public class RandomDemo {
    public static void main(String[] args){
        Random random = new Random();
        int num;
        num = random.nextInt(1,6);
        System.out.println(num);
        Boolean isHead;
        isHead = random.nextBoolean();

        if (isHead){
            System.out.println("Heads");
        }
        else {
            System.out.println("Tails");
        }
    }

}
