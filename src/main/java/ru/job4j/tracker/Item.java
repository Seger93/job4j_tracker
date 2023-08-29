package ru.job4j.tracker;

import lombok.*;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    @Getter
    @Setter
    private int id;

    @NonNull
    @EqualsAndHashCode.Include
    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private LocalDateTime created = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
}