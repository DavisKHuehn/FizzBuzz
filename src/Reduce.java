public class Reduce {
    public static void main(String[] args) {
        int stepsToZero = 0;
        int i = 100;

        while (i > 0) {
            if (i % 2 == 0) {
                i /= 2;
            } else {
                i--;
            }
            stepsToZero++;
        }
        System.out.println(stepsToZero);
    }
}
