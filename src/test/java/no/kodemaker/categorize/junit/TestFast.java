package no.kodemaker.categorize.junit;


import no.kodemaker.categorize.TestCategory;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class TestFast extends AbstractCategorizeTest {

    @BeforeClass
    public static void setUp() throws Exception {
        System.setProperty("testcategory","fast");
    }

    @Test
    @TestCategory(name = "fast")
    public void testFast() throws Exception {
        String category = System.getProperty("testcategory");
        assertThat(category,is("fast"));
    }

    @Test
    @TestCategory(name = "slow")
    public void testSlowNotRun() throws Exception {
        fail("Slow was run but expected only fast");
    }
}
