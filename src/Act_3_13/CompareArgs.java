package Act_3_13;

/**
 *
 * @author miquel
 */
public class CompareArgs {
//    static boolean equality(String v1, String v2) {
//        if (v1.equals(v2)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
    public static void main(String[] args) {
        if (args[0].equals(args[1])) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}

//class TestEquality {
//    public static void main(String[] args) {
//        CompareArgs.equality(args[0], args[1]);
//    }
//}
