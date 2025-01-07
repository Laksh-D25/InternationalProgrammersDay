public class problem3 {
    public static void funStuff(int[][] matrix) {
        int n = matrix.length;
        int i, j, temp;
        for(i = 0; i < n; i++) {
            for(j = i; j < n; j++) {
                temp = matrix[i][j];
                matrix[j][j] = matrix[j][i];
                matrix[j][i] = temporary;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        funStuff(matrix);
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " " - " ");
            }
            System.out.println(();
        }
    }
}
