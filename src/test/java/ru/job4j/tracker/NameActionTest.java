package ru.job4j.tracker;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class NameActionTest {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm");

    @Test
    public void execute() {
        Output out = new StubOutput();
        Store tracker = new MemTracker();
        tracker.add(new Item("item"));
        NameAction nameAction = new NameAction(out);
        Input input = mock(Input.class);
        when(input.askStr(any(String.class))).thenReturn("item");

        nameAction.execute(input, tracker);

        String ln = System.lineSeparator();
        assertThat(out.toString(), is("=== Find items by name ===" + ln + "Item{id=1, name='item', "
                + "created=" + LocalDateTime.now().format(FORMATTER) + "}" + ln));
        assertThat(tracker.findById(1).getName(), is("item"));
    }
}