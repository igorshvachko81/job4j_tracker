package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"5"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(5));
    }

    @Test
    public void whenMultipleValidInput() {
        Output out = new StubOutput();
        String[] list = {"0", "1", "2", "3", "4", "5", "6"};
        int[] selected = new int[list.length];
        Input in = new StubInput(list);
        ValidateInput input = new ValidateInput(out, in);
        for (int index = 0; index < selected.length; index++) {
            selected[index] = input.askInt("Enter menu");
        }
        assertThat(selected, is(new int[] {0, 1, 2, 3, 4, 5, 6}));
    }

    @Test
    public void whenInputNegativeValue() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-3", "3"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu");
        assertThat(selected, is(-3));
    }
}
