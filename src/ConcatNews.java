import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ConcatNews {

    public String concatFiles(String... nameOfFiles) { // hotnews.txt, stiri.txt gg.txt

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<nameOfFiles.length;i++) {

            Path path = Paths.get(nameOfFiles[i]);//iau numele
            try {
                String listOfUsersFromFile = Files.readString(path);
                sb.append(listOfUsersFromFile);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return sb.toString();

    }

    public static void main(String[] args) {
        ConcatNews cn = new ConcatNews();
        String r = cn.concatFiles("unu.txt", "doi.txt", "hotnews.txt", "stiripesurse.txt");
        System.out.println(r);
    }
}
