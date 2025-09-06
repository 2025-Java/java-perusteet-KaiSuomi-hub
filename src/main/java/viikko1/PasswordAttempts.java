package viikko1;
// tehtävä 4
public class PasswordAttempts {
    public static String login(String[] attempts) {
    int limit = 3;
    if (attempts == null)
        return "Liian monta virheellistä yritystä.";

    int n = Math.min(limit, attempts.length);

    for (int i = 0; i < n; i++) {
        if (check(attempts[i])) {
            return "Tervetuloa!";
            }
        }
    return "Liian monta virheellistä yritystä.";
    }

    private static final String SECRET = "java123";


    public static boolean check(String s) {
        return SECRET.equals(s);
    }
    // testaus PasswordAttemptsTest
     public static void main(String[] args) {
        System.out.println(login(new String[] {"no", "java123", "x"}));
        // -> "Tervetuloa!"
        System.out.println(login(new String[] {"a", "b"}));
        // -> "Liian monta virheellistä yritystä."
        System.out.println(login(new String[] { "no", "no", "no", "java123" }));
        // -> "Liian monta virheellistä yritystä."
    }
}