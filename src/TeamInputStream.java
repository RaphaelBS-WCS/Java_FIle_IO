import java.io.*;

public class TeamInputStream {
    public static void teamInput() {
        try{
            BufferedReader br = new BufferedReader(
                    new FileReader("Team.txt")
            );
            String s;
            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch(Exception ignored){}
    }
}