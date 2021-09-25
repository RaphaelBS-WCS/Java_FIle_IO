import java.io.*;

public class PersonInputStream {
    public static void PersonInput(String name) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(name + ".txt"));
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
        } catch (Exception ignored) {
        }
    }
}
