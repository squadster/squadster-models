package by.squadster.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Model class for squad member.
 *
 * @author Yegor Ikbaev
 * @version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class SquadMemberModel {

    /**
     * Unique id of squad member.
     */
    private Long id;

    /**
     * Role of squad member in squad.
     */
    private Integer role;

    /**
     * Queue of user in squad.
     */
    private Integer queueNumber;

    /**
     * User details of squad member.
     */
    private UserModel user;

    /**
     * Squad details of squad member
     */
    private SquadModel squad;
}
