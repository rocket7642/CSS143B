import java.util.Arrays;

public class MobilePhone {

    public String brand;

    public boolean hasPhysicalKeys;

    public int numberOfCamera;

    public String network;

    public void dial(int[]numbers) {
        System.out.println("calling " + Arrays.toString(numbers));
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "brand='" + brand + '\'' +
                ", hasPhysicalKeys=" + hasPhysicalKeys +
                ", numberOfCamera=" + numberOfCamera +
                ", network='" + network + '\'' +
                '}';
    }
}
