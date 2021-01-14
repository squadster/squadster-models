package by.squadster.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Model class for squad.
 *
 * @author Yegor Ikbaev
 * @version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class SquadModel {

    /**
     * Unique id of squad.
     */
    private Long id;

    /**
     * Number if squad (display name).
     */
    private String squadNumber;

    /**
     * Advertisement in squad.
     */
    private String advertisement;

    /**
     * Number of classes day.
     */
    private Integer classDay;

    /**
     * Is invitation by links enabled.
     */
    private Boolean linkInvitationsEnabled;

    /**
     * Hash of squad.
     */
    private String hashId;
}
