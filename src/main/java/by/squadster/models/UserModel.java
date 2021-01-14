package by.squadster.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * Model class for user.
 *
 * @author Yegor Ikbaev
 * @version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
class UserModel {

    /**
     * Unique id of user.
     */
    private Long id;

    /**
     * Uid of user (vkontakte id).
     */
    private String uid;

    /**
     * First name from vk.
     */
    private String firstName;

    /**
     * Last name from vk.
     */
    private String lastName;

    /**
     * Birth date from vk.
     */
    private LocalDate birthDate;

    /**
     * Mobile phone from vk.
     */
    private String mobilePhone;

    /**
     * University from vk.
     */
    private String university;

    /**
     * Faculty from vk.
     */
    private String faculty;

    /**
     * Small image url from vk.
     */
    private String smallImageUrl;

    /**
     * Image url from vk.
     */
    private String imageUrl;

    /**
     * Url to vk profile.
     */
    private String vkUrl;

    /**
     * Email of user.
     */
    private String email;
    
    /**
     * Hash id of user.
     */
    private String hashId;

    /**
     * Telegram user id.
     */
    private Integer telegramId;

    /**
     * Telegram token for registration.
     */
    private String telegramToken;

    /**
     * Telegram chat id.
     */
    private Long telegramChatId;
}
