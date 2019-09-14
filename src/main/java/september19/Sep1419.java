package september19;

public class Sep1419 {

    public int[] solve(int[] input) {
        // {3, 2, 1}
        int [] output = new int[input.length];
        int product = 1;
        for (int value : input) {
            product *= value;
        }
        for (int i = 0; i < input.length; i++) {
            output[i] = product/input[i];
        }
        return output;
    }
}