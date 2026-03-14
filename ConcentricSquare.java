public class ConcentricSquare {

    private static final int N = 4;

    public static void main(String[] args) {

        int size = 2 * N - 1;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {

                int top = row;
                int left = col;
                int bottom = size - 1 - row;
                int right = size - 1 - col;

                int minDistance = Math.min(Math.min(top, bottom), Math.min(left, right));
                int value = N - minDistance;

                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
