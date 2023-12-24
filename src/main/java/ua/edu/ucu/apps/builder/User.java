package ua.edu.ucu.apps.builder;


import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder
@ToString
public class User {
    private int id;
    private String name;
    private int age;
    private double weight;
    private double height;
    private Gender gender;
    @Singular
    private List<String> occupations;

    public static void main(String[] args) {
        User user = User.builder()
                .id(1)
                .name("Nazar")
                .age(18)
                .weight(70)
                .height(180)
                .gender(Gender.MALE)
                .occupation("Student")
                .occupation("Alcoholic")
                .build();
        System.out.println(user);
    }
}