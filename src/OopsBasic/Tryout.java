package OopsBasic;
import java.util.Date;
public class Tryout {

        private static Date dateCreated;

        public static void main(String[] args) {
            // This will throw NullPointerException because dateCreated is null
            System.out.println(dateCreated.toString());

            // Initialize the static variable
            dateCreated = new Date();

            // Now this will work correctly
            System.out.println(dateCreated.toString());
        }
    }


