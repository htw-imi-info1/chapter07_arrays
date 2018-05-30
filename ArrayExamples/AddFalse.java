
/**
 * AddFalse shows an example for Collection::add returning false.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AddFalse
{
    public static void demo(){
        java.util.HashSet<Integer> s = new java.util.HashSet<>();
        System.out.println(s.add(4));
        System.out.println(s.add(42));
        System.out.println(s.add(42));

    }
}
