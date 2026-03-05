public class HollowRactangle {
    public static void main(String args[]) {
        int totalRows = 4;
        int totalCols = 10;

        // outer loop
        for (int i = 1; i <= totalRows; i++) {
            // inner loop
            for (int j = 1; j <= totalCols; j++) {
                // cell (i,j) // boundary condition
                if (i == 1 || i == totalRows || j == 1 || j == totalCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
