import import java.util.Scanner;
public class Hello
{
    public static void main( String argv[] )
    {
        System.out.println("What's your name");
        Scanner in = new Scanner(System.in);
        String my_name = in.nextLine();
        System.out.println( "Hello, " + my_name + "!" );
    }
}