package ru.job4j.lombok;


import lombok.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@RequiredArgsConstructor
public class Category {

    @EqualsAndHashCode.Include
    @Getter
    private Integer id;

    @Setter
    @Getter
    private String name;
}