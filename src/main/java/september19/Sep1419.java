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

    public int[] solveNoDivision(int[] input){
        int[] left = new int[input.length];
        int[] right = new int[input.length];
        int[] solution = new int[input.length];

        left[0] = 1;
        right[input.length-1] = 1;
        for (int i = 0; i < input.length -1; i++) {
            left[i+1] = input[i] * left[i];
        }

        for (int i = input.length -1; i  > 0; i--) {
            right[i-1] = input[i] * right[i];
        }

        for (int i = 0; i <input.length; i++) {
            solution[i] = left[i] * right[i];
        }
        return solution;

    }
}