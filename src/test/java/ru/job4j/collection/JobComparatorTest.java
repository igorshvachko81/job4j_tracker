package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;

public class JobComparatorTest {
    @Test
    public void whenComparatorAscByName() {
        Comparator<Job> cmpAscName = new JobAscByName();
        int rsl = cmpAscName.compare(
                new Job("Read file", 5),
                new Job("Print file", 8)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorAscByPriority() {
        Comparator<Job> cmpAscPriority = new JobAscByPriority();
        int rsl = cmpAscPriority.compare(
                new Job("Read file", 5),
                new Job("Print file", 8)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorDescByName() {
        Comparator<Job> cmpDescName = new JobDescByName();
        int rsl = cmpDescName.compare(
                new Job("Read file", 5),
                new Job("Print file", 8)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorDescByName2() {
        Comparator<Job> cmpDescName = new JobDescByName();
        int rsl = cmpDescName.compare(
                new Job("Print file", 8),
                new Job("Read file", 5)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorDescByPriority() {
        Comparator<Job> cmpDescPriority = new JobDescByPriority();
        int rsl = cmpDescPriority.compare(
                new Job("Print file", 8),
                new Job("Read file", 5)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorDescByPriority2() {
        Comparator<Job> cmpDescPriority = new JobDescByPriority();
        int rsl = cmpDescPriority.compare(
                new Job("Read file", 5),
                new Job("Print file", 8)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorAscByNamePriority() {
        Comparator<Job> cmpAscNamePriority = new JobAscByName().
                thenComparing(new JobAscByPriority());
        int rsl = cmpAscNamePriority.compare(
                new Job("Read file", 5),
                new Job("Print file", 8)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorAscByPriorityName() {
        Comparator<Job> cmpAscPriorityName = new JobAscByPriority().
                thenComparing(new JobAscByName());
        int rsl = cmpAscPriorityName.compare(
                new Job("Read file", 5),
                new Job("Print file", 8)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorDescByNamePriority() {
        Comparator<Job> cmpAscNamePriority = new JobAscByName().
                thenComparing(new JobAscByPriority());
        int rsl = cmpAscNamePriority.compare(
                new Job("Read file", 5),
                new Job("Print file", 8)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorDescByPriorityName() {
        Comparator<Job> cmpDescPriorityName = new JobDescByPriority().
                thenComparing(new JobDescByName());
        int rsl = cmpDescPriorityName.compare(
                new Job("Read file", 8),
                new Job("Print file", 8)
        );
        assertThat(rsl, lessThan(0));
    }
}
