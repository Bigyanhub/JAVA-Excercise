public class MultiArrayDemo {

    public static void main(String[] args) {

        int[][] table = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9, 10, 11 }
        };
        for (int r = 0; r < table.length; r++) {
            for (int c = 0; c < table[r].length; c++) {
                System.out.println(table[r][c] + " " + "[" + r + "]" + "[" + c + "]");
            }

            System.out.println();
        }
    };

}