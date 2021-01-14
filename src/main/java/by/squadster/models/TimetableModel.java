package by.squadster.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

/**
 * Model class for timetable.
 *
 * @author Yegor Ikbaev
 * @version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class TimetableModel {

    /**
     * Unique id of timetable.
     */
    private Long id;

    /**
     * Link to squad.
     */
    private SquadModel squad;

    /**
     * Date of classes.
     */
    private LocalDate date;

    /**
     * Lessons of this timetable.
     */
    private List<LessonModel> lessons;
}
