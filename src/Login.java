import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Login {


    public boolean isLoggedIn() {

        Login l = new Login();
        List<String> lS = l.loadFromDB();
        List<User> lU= l.getListOfUsers(lS);

        System.out.println(lU.size());


        System.out.println(lU);

        boolean success=false;
        do {
            System.out.println("da datele");
            String user =new Scanner(System.in).nextLine();
            String password =new Scanner(System.in).nextLine();
            User uI = new User(user,password);
            for(User u: lU) {
                if(uI.equals(u))
                    success=true;

            }

        }
        while(!success);

        return true;


    }

    private List<String> loadFromDB() {
        List<String> listOfUsersFromFile = new ArrayList<>();
        Path path = Paths.get("users.txt");
        try {
            listOfUsersFromFile = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfUsersFromFile;

    }

//    private List<User> getListOfUsers(List<String> listOfUsersFromFile) {
//
//        List<User>  listOfUserObj = new ArrayList<>();
//        for(String line: listOfUsersFromFile) {
//            User u = new User();
//            for(String singleuser: line.split(","))
//            {
//                System.out.println(singleuser);
//
//            }
//
//
//        }
//       return listOfUserObj;
//    }

    private List<User> getListOfUsers(List<String> listOfUsersFromFile) {

        List<User>  listOfUserObj = new ArrayList<>();//gol
        for(int i=0;i<listOfUsersFromFile.size();i++) {//parcurg lista primita
            User u = new User();//gol
            String currentLine = listOfUsersFromFile.get(i);//iau linia curenta
           // System.out.println(currentLine);
            StringTokenizer st = new StringTokenizer(currentLine, ",");//parsez linia curenta dupa tokenul ,
            while(st.hasMoreTokens()) { // parcurg lina curenta dupa tokens ,
                String user = st.nextToken(); //user
                String pwd = st.nextToken(); // parola
                u.setUsername(user);
                u.setPassword(pwd);
            }
            listOfUserObj.add(u); // pun obiectul in lista de Users
        }
       return listOfUserObj;
    }


    public static void main(String[] args) {



    }
}
