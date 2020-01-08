import java.util.Objects;

class MaxNumberAnswer{
    int maxNumber;
    boolean foundAnswer;

    public MaxNumberAnswer(int maxNumber, boolean foundAnswer) {
        this.maxNumber = maxNumber;
        this.foundAnswer = foundAnswer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MaxNumberAnswer that = (MaxNumberAnswer) o;
        return maxNumber == that.maxNumber &&
                foundAnswer == that.foundAnswer;
    }

    @Override
    public String toString() {
        return "MaxNumberAnswer{" +
                "maxNumber=" + maxNumber +
                ", foundAnswer=" + foundAnswer +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("testFindMax " + (testFindMax() ? "PASSED" : "FAILED"));
    }

    public static MaxNumberAnswer findMax(int []data) {
        if (data.length<=0) {
            return new MaxNumberAnswer(-1, false);
        }
        int val = data[0];
        for (int i=1; i<data.length; i++) {
            if (val<data[i]) {
                val = data[i];
            }
        }
        return new MaxNumberAnswer(val, true);
    }

    public static boolean testFindMax() {
        // prepare the answers
        int inputs[][] = {
                {},
                {1},
                {-2, 2},
                {3, -3},
                {1, 2, 3},
                {3, 2, 1},
                {-4, -4, -4},
                {-1, 0, 9, 3, 2}};
        int values[] = {-1, 1, 2, 3, 3, 3, -4, 9};
        MaxNumberAnswer[] answers = new MaxNumberAnswer[inputs.length];
        for (int i=0; i<inputs.length; i++) {
            answers[i] = new MaxNumberAnswer(values[i], (i==0 ? false : true));
        }

        // compare answer. return false if any case fails. true otherwise
        for (int i=0; i<inputs.length; i++) {

            MaxNumberAnswer expected = findMax(inputs[i]);
            MaxNumberAnswer actual = answers[i];

            if (!expected.equals(actual)) {
                System.out.printf("Case %d: Expected %s, actual %s\n", i, expected, actual);
                return false;
            }
        }
        return true;
    }
}
