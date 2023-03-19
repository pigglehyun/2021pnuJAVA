import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


enum Command{
    QUIT,ADD,LIST,SUM,MAX,MIN,INVALID
}

public class ArrayEnum {
    public static void main(String[] args){

        int []values = new int[100];
        Arrays.fill(values,0);
        int index = 0;
        final Scanner scanner = new Scanner(System.in);

        while(true){
            final Command command = getCommand(scanner);
            if(command == Command.QUIT){
                System.out.println("Bye!");
                break;
            }
            switch(command){
                case ADD:
                    final int newValue = getValue(scanner);
                    values[index] = newValue;
                    index++;
                    break;
                case LIST:
                    printList(values,index);
                    break;
                case SUM:
                    System.out.println(getSum(values,index));
                    break;
                case MAX:
                    System.out.println(getMax(values,index));
                    break;
                case MIN:
                    System.out.println(getMin(values,index));
                    break;
                case INVALID:
                    System.out.println("Invalid Command");
                    break;
            }
        }
        scanner.close();
    }

    private static Command getCommand(Scanner scanner){
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
    public static int getValue(Scanner scanner){
        final int a = scanner.nextInt();
        return a;
    }
    public static int getSum(int[] values, int index){
        int sum = 0 ;
        for( int i = 0 ; i < index ; i++) {
            sum += values[i];
        }
        return sum;
    }
    public static void printList(int[] values, int index){
        for(int i = 0 ; i < index ; i++){
            System.out.print(values[i]+ " ");
        }
        System.out.println();
    }
    public static int getMax(int[] values, int index){
        int max = values[0];
        for(int i = 0; i < index ; i++){
            if (values[i] > max) max = values[i];
        }
        return max;
    }
    public static int getMin(int[] values, int index){
        int min = values[0];
        for(int i = 0; i < index ; i++){
            if (values[i] < min) min = values[i];
        }
        return min;
    }
}
