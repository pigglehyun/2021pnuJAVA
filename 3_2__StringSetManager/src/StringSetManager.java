import java.util.Locale;
import java.util.Scanner;

enum StringCommand { ADD, REMOVE, CLEAN, QUIT, INVALID};
public class StringSetManager {

    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);
        String[] stringSet = new String[100];


        while(true){
            final StringCommand command = getCommand(scanner);
            if( command == StringCommand.QUIT){
                System.out.println("BYE!");
                break;
            }

            switch ( command ){
                case ADD:
                    final String str = getString(scanner);
                    add(stringSet,str);
                    break;
                case REMOVE:
                    final String str1 = getString(scanner);
                    remove(stringSet,str1);
                    break;
                case CLEAN:
                    clear(stringSet);
                    break;
                default:
                    System.out.println("Unknown Command!");
                    break;
            }
            print(stringSet);
        }
    }
    static int index = 0;
    public static StringCommand getCommand(Scanner scanner){
        final String cmd = scanner.next();
        StringCommand command;
        try{
            command = StringCommand.valueOf(cmd.toUpperCase(Locale.ROOT));
        }
        catch(IllegalArgumentException e){
            command = StringCommand.INVALID;
        }
        return command;
    }
    public static String getString(Scanner scanner){
        final String str = scanner.next();
        return str;
    }
    public static void add(String[] sset, String str){
        for(int i = 0 ; i < index ; i++){
            if (sset[i].equals(str))
               return;
            }
        sset[index] = str;
        index++;
        }

    public static void remove(String[] sset, String str){
        for(int i = 0; i <index ;i++){
            if(sset[i].equals(str)){
                for(int k = i ;k<index;k++){
                    sset[k] = sset[k+1];
                }
                sset[index-1] = null;
                index--;
                break;
            }
        }

    }
    public static String[] clear(String[] sset){
        for(int i = 0 ; i < index ; i++) sset[i] = null;
        index =0;
        return sset;
    }
    public static void print(String[] sset){
        System.out.print("Element Size: "+ index + ", Values = [");
        for(int i = 0 ; i < index; i++){
            System.out.print(" "+sset[i]);
            if( i != index -1) System.out.print(",");
        }
        System.out.print("]\n");
    }
}
