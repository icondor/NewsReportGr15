import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("stsrt login ");

        Login l = new Login();
        boolean b = l.isLoggedIn();
        if(b)
        {

            System.out.println("start modul 1");
            ConcatNews cn = new ConcatNews();
            String result = cn.concatFiles("unu.txt", "doi.txt");//pasul 3

            NewsParser np = new NewsParser();
            Map<String,Integer> resultReport = np.parseBasedOnOccurances(result);

            Report r = new Report();
            r.printReport(resultReport);



        }



    }
}