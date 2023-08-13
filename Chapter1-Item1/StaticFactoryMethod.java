import java.math.BigInteger;
import java.util.*;
//
public class StaticFactoryMethod {
    /** EFFECTIVE JAVA
     * Chapter-1 Item-1
     * Consider static factory method instead of constructor
     * <p>
     * 1)One advantage of static factory methods is that, unlike constructors, they
     * have names.
     * <p>
     * 2)A second advantage of static factory methods is that, unlike constructors,
     * they are not required to create a new object each time they’re invoked.
     * <p>
     * 3)A third advantage of static factory methods is that, unlike constructors,
     * they can return an object of any subtype of their return type.
     * <p>
     * 4)A fourth advantage of static factories is that the class of the returned
     * object can vary from call to call as a function of the input parameters.
     * <p>
     * 5)A fifth advantage of static factories is that the class of the returned object
     * need not exist when the class containing the method is written.
     *
     * The main limitation of providing only static factory methods is that
     * classes without public or protected constructors cannot be subclassed.
     *
     * A second shortcoming of static factory methods is that they are hard for
     * programmers to find.
     *
     * In summary, static factory methods and public constructors both have their
     * uses, and it pays to understand their relative merits. Often static factories are
     * preferable, so avoid the reflex to provide public constructors without first considering static factories
     */

    public static void main(String[] s) {

        BigInteger bigIntegerConstructor = new BigInteger(5, 5, new Random());
        BigInteger bigIntegerStatic = BigInteger.probablePrime(5, new Random());
        // 2'side asal sayı oluşturuyor. Fakat constuctorstan oluşturunca adlandırma olmadığı için anlaşılmıyor.

        System.out.println(bigIntegerStatic);
        System.out.println(bigIntegerConstructor);

        String stringTrue = "true";
        String stringFalse = "false";
        String stringNull = null;
        Boolean yTrue = Boolean.valueOf(stringTrue);
        Boolean yFalse = Boolean.valueOf(stringFalse);
        Boolean yNull = Boolean.valueOf(stringNull);

        System.out.printf("%s,%s,%s%n", yTrue, yFalse, yNull);

        Boolean q = new Boolean(true);
        Boolean w = Boolean.valueOf(q);

        List<String> list = new ArrayList<>();
        // Enumset.noneOf() fonksiyonunda Enumun size'ına göre
        // if (universe.length <= 64)
        //            return new RegularEnumSet<>(elementType, universe);
        //        else
        //            return new JumboEnumSet<>(elementType, universe);
        EnumSet<Days> enumSet = EnumSet.allOf(Days.class);
        System.out.println("Stop");

    }
}
