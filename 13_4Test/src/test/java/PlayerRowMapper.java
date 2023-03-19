import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PlayerRowMapper implements
        JdbcTemplate.RowMapper<List<Player>> {
    public List<Player> mapRow(ResultSet rs) throws SQLException {
        List<Player> players = new ArrayList<>();
        while(rs.next()) {

            String countryName = rs.getString("COUNTRY_NAME");
            String clubName = rs.getString("CLUB_NAME");

            Player player = new Player();
            Club club = new Club();
            club.setName(clubName);
            Country country = new Country();
            country.setName(countryName);
            player.setClub(club);

            players.add(player);
        }
        return players;
    }
}