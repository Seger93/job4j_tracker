package ru.job4j.lombok;

import lombok.*;

import java.util.List;

@Builder(builderMethodName = "of")
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class Permission {

    @Getter
    private int id;

    @Getter
    @Setter
    private String name;

    @Singular("accessBy")
    private List<String> rules;
}