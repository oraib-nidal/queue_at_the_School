import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        scanner.nextLine();//newline

        String s = scanner.nextLine();

        if (n >= 1 && n <= 50) {
            if (s.length() != n) {

                return;
            }
            boolean valid = s.chars().allMatch(c -> c == 'G' || c == 'B');
            if (!valid) {

                return;
            }
            char[] children = s.toCharArray();
            for (int second = 0; second < t; second++) {
                int i = 0;
                while (i < children.length - 1) {
                    if (children[i] == 'B' && children[i + 1] == 'G') {
                        char temp = children[i];
                        children[i] = children[i + 1];
                        children[i + 1] = temp;

                        i++;
                    }
                    i++;
                }

            }
            String result = new String(children);
            System.out.println(result);

            scanner.close();
        }
    }
}