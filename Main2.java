import java.util.Scanner;
import static java.lang.System.out;

public class Main2{

    public static void main(String[] args){
        Main2 n = new Main2();
        Scanner sc = new Scanner(System.in);
        out.println("Введите день недели: ");
        String x = sc.nextLine();
        n.printDays (x);
    }


    public void printDays (String x){
        switch (x){
            case "понедельник":
                out.println("понедельник");
                out.println("вторник");
                out.println("среда");
                out.println("четверг");
                out.println("пятница");
                out.println("суббота");
                out.println("воскресенье");
                break;
            case "вторник" :
                out.println("вторник");
                out.println("среда");
                out.println("четверг");
                out.println("пятница");
                out.println("суббота");
                out.println("воскресенье");
                break;
            case "среда" :
                out.println("среда");
                out.println("четверг");
                out.println("пятница");
                out.println("суббота");
                out.println("воскресенье");
                break;
            case "четверг" :
                out.println("четверг");
                out.println("пятница");
                out.println("суббота");
                out.println("воскресенье");
                break;
            case "пятница":
                out.println("пятница");
                out.println("суббота");
                out.println("воскресенье");
                break;
            case "суббота" :
                out.println("суббота");
                out.println("воскресенье");
                break;
            case "воскресенье" :
                out.println("воскресенье");
                break;
            default:
                out.println("это не день недели");
                break;
        }
    }
}