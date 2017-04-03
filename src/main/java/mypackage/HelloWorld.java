package mypackage;

/**
 * Created by Jack on 03.04.2017.
 */
public class HelloWorld {

    public static void main(String[] args) {

        System.out.print("Enter your URL: ");

        try {
            //parse 1st and 2nd CMD argument for example
            String arg = args[0];
            String arg2 = args[1];

            System.out.println(arg);
            System.out.println(arg2);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
