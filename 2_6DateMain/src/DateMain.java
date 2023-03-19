import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateMain {
    public static void main(String[] args){
        final Date now = new Date();
        final SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 " +
                "yyyy-MM-dd HH:mm:ss 오늘은 이 달의 W번째 E요일 입니다.", Locale.KOREA);
    System.out.println(format.format(now));
    }
}
