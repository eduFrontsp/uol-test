package eduardo.java.uoltest.model.dtos;

import eduardo.java.uoltest.model.GroupType;

public record PlayerDto(

        String name,
        String email,
        String phoneNumber,
        GroupType groupType
) {
}
