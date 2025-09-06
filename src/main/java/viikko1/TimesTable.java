package viikko1;
// tehtävä 3
public class TimesTable {

    public static String line(int n, int i) {
        return n + " x " + i + " = " + (n * i) + "\n";
    }

    public static String table10(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            sb.append(line(n, i));
        }
        return sb.toString();
    }

    public static String table(int n) {
        return table10(n);
    }
    // testaus
    public static void main(String[] args) {
        System.out.println(line(5, 1));      // test single line
        System.out.println(table10(5));      // test full table
    }
}
