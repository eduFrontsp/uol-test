package eduardo.java.uoltest.service;

import eduardo.java.uoltest.infra.CodinameHandler;
import eduardo.java.uoltest.model.GroupType;
import eduardo.java.uoltest.model.Player;
import eduardo.java.uoltest.model.dtos.PlayerDto;
import eduardo.java.uoltest.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository repository;

    @Autowired
    private CodinameHandler handler;
    private eduardo.java.uoltest.model.GroupType GroupType;

    public Player createPlayer(PlayerDto dto) {
        Player newPlayer = new Player(dto);
        String codiname = getCodiname(dto.groupType());
        newPlayer.setCodiname(codiname);
        return repository.save(newPlayer);
    }

    private  String getCodiname(GroupType groupType) {
        return handler.findCodiname(GroupType);
    }

    public List<Player> getAllPlayers() {
        return repository.findAll();
    }
}
