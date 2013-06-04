package ut.com.atlassian.joshluisaac.org;

import org.junit.Test;
import com.atlassian.joshluisaac.org.MyPluginComponent;
import com.atlassian.joshluisaac.org.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}