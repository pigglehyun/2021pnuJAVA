import java.util.Locale;
import java.util.Scanner;
enum Command{
    ADD,PRINT,QUIT,INVALID
}
public class SwitchMain2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        String[] savemonth = new String[100];
        int index = 0;

        while(true){

            final Command command = getCommand(scanner);
            if(command == Command.QUIT){
                System.out.println("Bye");
                break;
            }

            switch( command ) {
                case ADD:
                    savemonth[index] = getMonth(scanner,month);
                    index++;
                    break;
                case PRINT:
                    printList(savemonth,index);
                    break;
                case INVALID:
                    System.out.println("Invalid Command");
                    break;
                default:
                    break;
            }
        }
        scanner.close();
    }
    public static Command getCommand(Scanner scanner){
        final String cmd = scanner.next();
        Command command;
        try{
            command = Command.valueOf(cmd.toUpperCase(Locale.ROOT));
        }
        catch(IllegalArgumentException e){
            command = Command.INVALID;
        }
        return command;
    }
    public static String getMonth(Scanner scanner,String[] month){
        final int value = scanner.nextInt();
        return month[value-1];

    }
    public static void printList(String[] month, int index){
        System.out.print("[");
        for(int i = 0 ; i < index ; i ++){
            if(i <index-1)
                System.out.print(month[i] + ", ");
            else
                System.out.print(month[i] );
        }
        System.out.println("]");
    }
}
