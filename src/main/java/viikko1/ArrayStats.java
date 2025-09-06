package viikko1;
// Tehtävä 5
public class ArrayStats {
   public static double average(int[] arr) {
        if (arr == null || arr.length == 0) return 0.0;
            int sum = 0;
            for (int v : arr) sum += v;
            return sum / (double) arr.length;
    }

    public static int max(int[] arr) {
        if (arr == null || arr.length == 0)
            return Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;
        for (int value : arr)
            if (value > min)
                min = value;
        return min;
    }
    // testaus ArrayStatsTest
      public static void main(String[] args) {
        System.out.println(average(new int[]{1, 2, 3})); // odotettu 2.0
        System.out.println(max(new int[]{-11, 22, 3, 5})); //22.0
        System.out.println(average(new int[]{}));
        System.out.println(max(new int[]{})); //Integer.MIN_VALUE -2147483648
    }
}
