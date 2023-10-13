public class Multiples {
    public static void main(String[] args) {
        int multiplesCount = 0;

        for (int i = 0; i < 334; i++) {
            multiplesCount++;

            if (i * 5 < 1000) {
                multiplesCount++;
            }
        }

        System.out.println(multiplesCount);
    }
}
