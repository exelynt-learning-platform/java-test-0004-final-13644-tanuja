public class ConcentricSquare {

    private static final int MAX_LAYER = 4;

    public static void main(String[] args) {

        int size = 2 * MAX_LAYER - 1;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {

                int distanceFromTop = row;
                int distanceFromLeft = col;
                int distanceFromBottom = size - 1 - row;
                int distanceFromRight = size - 1 - col;

                int minDistance = Math.min(
                        Math.min(distanceFromTop, distanceFromBottom),
                        Math.min(distanceFromLeft, distanceFromRight)
                );

                int valueToPrint = MAX_LAYER - minDistance;

                System.out.print(valueToPrint + " ");
            }
            System.out.println();
        }
    }
}
