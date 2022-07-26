package FindPathCount;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // write your code here
        int[][] array = {

                {1, 0, 1},

                {1, 1, 1},

                {1, 1, 1}

        };
        findPaths(array);
    }

    private static void findPaths(int[][] array) {
        List<String> list = new ArrayList<>();
        printPaths(array, 0, 0, list);
    }


    private static void printPaths(int[][] mat, int i, int j, List<String> list) {
        int m = mat.length - 1;
        int n = mat[0].length - 1;
        //return if i or j crosses matrix size
        if (i > m || j > n)
            return;

        if (mat[i][j] != 1) {
            return;
        }


        list.add("[" + i + "," + j + "]");
        if (i == m && j == n) {
            System.out.println(list);
        }

        printPaths(mat, i + 1, j, list);
        printPaths(mat, i, j + 1, list);

        list.remove(list.size() - 1);
    }
}
