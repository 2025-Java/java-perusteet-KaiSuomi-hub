package viikko1;
// tehtävä 1
public class NumberProperties {
    public static String describe(int n) {
        if (n == 0) return "nolla";
        boolean even = (n % 2 == 0);
        if (n > 0) return even ? "positiivinen parillinen" : "positiivinen pariton";
        return even ? "negatiivinen parillinen" : "negatiivinen pariton";
    }
}
