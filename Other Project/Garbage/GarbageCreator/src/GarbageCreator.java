import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) throws IOException {
        String filename = "D:\\test.txt";
        byte[] inputBytes = {};
        long startTime, endTime;

        inputBytes = Files.readAllBytes(Paths.get(filename));
        startTime = System.currentTimeMillis();
        StringBuilder outputString = new StringBuilder();

        for (byte b : inputBytes) {
            outputString.append((char) b);
        }

        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        System.out.println("Bui Quang Phuong 202355809");
    }
}
