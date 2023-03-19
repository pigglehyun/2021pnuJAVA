import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class DatabaseTest {
    public static void main(String[] args) {

        String clubsql ="INSERT INTO CLUB (CLUB_NAME) VALUES ('PUN');" +
                "INSERT INTO CLUB (CLUB_NAME) VALUES ('PUN');" +
                "INSERT INTO CLUB (CLUB_NAME) VALUES ('PUN');" +
                "INSERT INTO CLUB (CLUB_NAME) VALUES ('PUN');" +
                "INSERT INTO CLUB (CLUB_NAME) VALUES ('PUN');";
        String countrysql ="INSERT INTO COUNTRY (COUNTRY_NAME) VALUES ('BUSAN')";
        PlayerRepository playerRepository;
        JdbcTemplate template = new JdbcTemplate();
        List<Player> players = template.query(clubsql, new PlayerRowMapper());
        players.stream().forEach(System.out::println);



    }
}
