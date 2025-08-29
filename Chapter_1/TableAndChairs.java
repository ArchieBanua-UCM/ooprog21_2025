public class TableAndChairs {
    public static void main(String[] args) {
        int rows = 7;
        int cols = 22; // proper with spacing

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++){
                // first 2 rows: para sa duha ka tiil both side
                if (r < 2 && (c == 0 || c == cols - 1)) {
                System.out.print("X");
            }
            // row 2 ang top table
            else if (r == 2 && ( c == 0 || c == cols - 1 || (c >= 6 && c <= 15))) {
                System.out.print("X");
            }
            // row 3 table edge
            else if (r == 3 && (c <= 4 || c >= cols - 5 || c == 6 || c == 15)) {
                System.out.print("X");
            }
            // row 4 - 6 table + chair legs
            else if (r >= 4 && (c == 0 || c == 4 || c == 6 || c == 15 || c == cols - 5 || c == cols - 1)) {
                System.out.print("X");
            }
            else {
                System.out.print(" ");
            }
    }
    System.out.println();

       }
    }
}