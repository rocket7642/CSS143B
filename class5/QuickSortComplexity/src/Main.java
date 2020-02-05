import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        timeSort();
    }

    private static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    private static void quickSort(int data[], int low, int high)
    {
        if (low < high)
        {
            int pivotIndex = partition(data, low, high);

            quickSort(data, low, pivotIndex-1);
            quickSort(data, pivotIndex+1, high);
        }
    }

    public static long bubbleSort(int data[]) {
        long startTime = System.nanoTime();

        for (int i=0; i<data.length-1; i++) {
            for (int j=0; j<data.length-i-1; j++) {
                if (data[j] > data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }

        long endTime = System.nanoTime();
        return TimeUnit.MILLISECONDS.convert(endTime - startTime, TimeUnit.NANOSECONDS);
    }

    public static long quickSort(int data[]) {
        long startTime = System.nanoTime();

        quickSort(data, 0, data.length-1);

        long endTime = System.nanoTime();
        return TimeUnit.MILLISECONDS.convert(endTime - startTime, TimeUnit.NANOSECONDS);
    }

    public static void timeSort() {
        int start = 5000;
        int end = start * 40;
        for (int i=start; i<=end; i+=5000) {
            int[] dataBubble = new int[i];
            for (int j=0; j<dataBubble.length; j++) {
                dataBubble[j] = getRandomNumberInRange(-1000, 1000);
            }

            int[] dataQuick = dataBubble.clone();

            long timeBubble = bubbleSort(dataBubble);
            long timeQuick = quickSort(dataQuick);

            if (!Arrays.equals(dataBubble, dataQuick)) {
                System.out.println("timeSort FAILED, bubble:" + Arrays.toString(dataBubble) +
                                    " ,quick:" + Arrays.toString(dataQuick));
                return;
            }

            System.out.printf("%d %d %d\n", dataBubble.length, timeBubble, timeQuick);
        }
    }

    //https://mkyong.com/java/java-generate-random-integers-in-a-range/
    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
}
