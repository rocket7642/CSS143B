public class Main {
    public static String testStringAssignment(String str) {
        str = "changing to a new string in testStringAssignment";
        return str;
    }

    public static String testStringImmutable(String str) {
        str = str.concat("adding some new chars from testStringImmutable");
        return str;
    }

    public static StringBuilder testStringBuilder(StringBuilder builder) {
        builder = builder.append(", adding new strings from testStringBuilder");
        return builder;
    }

    public static void main(String[] args) {
        String str = "sky is blue";

        // attempting to change the String by assignment
        testStringAssignment(str);
        System.out.println("After calling testStringAssignment: " + str);

        // attempting to change the String by calling its reference
        testStringImmutable(str);
        System.out.println("After calling testStringImmutable: " + str);

        // attempting to change the String with StringBuilder
        StringBuilder builder = new StringBuilder();
        builder.append("sky is blue");
        testStringBuilder(builder);
        System.out.println("After calling testStringBuilder: " + builder.toString());



    }
}
