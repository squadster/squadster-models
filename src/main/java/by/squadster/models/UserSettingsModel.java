package by.squadster.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Model class for user settings.
 *
 * @author Yegor Ikbaev
 * @version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class UserSettingsModel {

    /**
     * Unique id of settings.
     */
    private Long id;

    /**
     * Is notifications in vk enabled.
     */
    private Boolean vkNotificationsEnabled;

    /**
     * Is notifications in telegram enabled.
     */
    private Boolean telegramNotificationsEnabled;

    /**
     * Is notifications in email enabled.
     */
    private Boolean emailNotificationsEnabled;
}
