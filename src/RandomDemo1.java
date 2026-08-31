import com.sun.security.jgss.GSSUtil;

public class RandomDemo1 {
    static void main(String[] args) {
        int num[][] = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                num[i][j] = (int) (Math.random() * 10);
                System.out.print(num[i][j] + " ");

            }
            System.out.println();
        }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {

                    System.out.print(num[i][j] + " ");

                }
                System.out.println();
            }


        }
    }
