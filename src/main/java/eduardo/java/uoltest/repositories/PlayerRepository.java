package eduardo.java.uoltest.repositories;

import eduardo.java.uoltest.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository  extends JpaRepository<Player, Long> {
}
