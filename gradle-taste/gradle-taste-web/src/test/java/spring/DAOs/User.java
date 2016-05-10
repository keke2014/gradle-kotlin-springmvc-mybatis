package spring.DAOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by juke.zjk on 2016/5/6 006.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String name;
    private Integer age;

    public static User build(String name, Integer age) {
        return new User(name, age);
    }
}
