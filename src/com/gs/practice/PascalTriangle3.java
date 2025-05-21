import java.util.List;
import java.util.ArrayList;

public class PascalTriangle3 {

    public static void main(String[] args) {
        PascalTriangle3 pt3 = new PascalTriangle3();

        int numRows = 5; // Generate Pascal's Triangle up to row 5
        List<List<Integer>> triangle = pt3.pascalTriangle3(numRows);

        System.out.println("Pascal's Triangle up to row " + numRows + ":");
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }

    public List<List<Integer>> pascalTriangle3(int n) {
        List<List<Integer>> totalList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                int result = ncr(i - 1, j - 1);
                list.add(result);
            }
            totalList.add(list);
        }
        return totalList;
    }

    public int ncr(int n, int r) {
        int result = 1;
        for (int i = 0; i < r; i++) {
            result = result * (n - i);
            result = result / (i + 1);
        }
        return result;
    }
}
