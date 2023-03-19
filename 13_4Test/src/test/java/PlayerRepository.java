import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PlayerRepository implements IRepository{
    private final  List<Player> players = new ArrayList<>();

    @Override
    public void save(Player t) {
        Player player = t;
        players.add(player);

    }
    @Override
    public void deleteById(int id) {
        for(Player p: players){
            if (p.getId() == id){
                players.remove(p);
                break;
            }
        }
    }

    @Override
    public List<Player> findAll() {
        return players;
    }

    @Override
    public Optional<Player> findById(int id) {
        return players.stream().filter(player -> player.getId() == id)
                .findFirst();
    }
}
