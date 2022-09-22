package analysis;

public class FindDuplicate {

    public static int calcStepsHasDuplicate1(int[] array) {
        int steps = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                steps++;
                if (i != j && array[i] == array[j]) {
                    return steps;
                }
            }
        }
        return steps;
    }
}
