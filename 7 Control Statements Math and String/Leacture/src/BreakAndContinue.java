public class BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("Before loop: ");
        for (int i = 1; i < 1000; i++) {
            if (i == 100) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Out of loop: ");


        System.out.print("Before loop: ");
        for (int j = 1; j < 10; j++) {
            if (j == 5) {
                continue;
            }
            System.out.println(j+ " ");

        }
        System.out.print("Out of loop: ");
    }
}
