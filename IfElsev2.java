public class IfElsev2 {

    private static boolean validate() {
        String val1 = "abc";
        String val2 = "xyz";

        if (val1 == "def") {
            return false;
        }

        return val1 == val2;
    }

    public static void main(String[] args) {

        System.out.println(validate());
    }

}
