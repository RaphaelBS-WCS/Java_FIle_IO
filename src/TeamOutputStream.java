import java.io.*;

public class TeamOutputStream {

    public static void teamOutPut(String[] personList){
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("Team.txt")
            );
            for (int i = 0; i < personList.length; i++) {
                bw.write(personList[i] + "\n");
            }
            bw.close();
        } catch (Exception ignored) {
        }
    }
}
