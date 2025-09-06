package viikko1;
// tehtävä 2
public class SortThree {
    public static String ascending(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int mid = a + b + c - min - max;
        return min + "," + mid + "," + max;
    }
}