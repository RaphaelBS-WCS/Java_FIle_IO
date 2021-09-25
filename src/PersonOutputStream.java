import java.io.*;
import java.util.Arrays;

class PersonOutputStream {
    public static void personOutPut(String name) {
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter(name+ ".txt")
            );
            bw.write(name);
            bw.close();
        } catch (Exception ignored){
        }
    }
}