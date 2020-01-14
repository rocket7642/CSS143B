public class Main {

    public static void main(String[] args) {

        // create two objects of the class MobilePhone
        MobilePhone iphone = new MobilePhone();
        iphone.brand = "Apple";
        iphone.hasPhysicalKeys = false;
        iphone.numberOfCamera = 1;
        iphone.network = "ATT";

        MobilePhone android = new MobilePhone();
        android.brand = "Samsung";
        android.hasPhysicalKeys = true;
        android.numberOfCamera = 2;
        android.network = "Tmobile";

        System.out.println(iphone);
        System.out.println(android);

        String newNetwork = "Verizon";
        resetNetwork(android, newNetwork);
        System.out.println("phone is "  + android);
        System.out.println("newNetwork string is " + newNetwork);
    }

    private static void resetNetwork(MobilePhone phone,
                                     String newNetwork) {
        phone.network = newNetwork;
        newNetwork = "";
    }
}
