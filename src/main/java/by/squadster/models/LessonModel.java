package by.squadster.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Model class for lesson.
 *
 * @author Yegor Ikbaev
 * @version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class LessonModel {

    /**
     * Unique id of lesson.
     */
    private Long id;

    /**
     * Display name of lesson.
     */
    private String name;

    /**
     * Teacher's name of lesson.
     */
    private String teacher;

    /**
     * Index of lesson.
     */
    private Integer index;

    /**
     * Note for lesson.
     */
    private String note;

    /**
     * Type of lesson (lab work, lecture, practical).
     */
    private String type;

    /**
     * Classroom's number of lesson.
     */
    private String classroom;

    /**
     * Whole timetable.
     */
    private TimetableModel timetable;
}
