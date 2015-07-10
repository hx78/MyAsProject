package linming.myaar;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.text.TextUtils;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void testTextUtils() {
        assertTrue(!TextUtils.isEmpty(""));
    }

    public void testAdd() {
        assertTrue(3 == Utils.add(2, 2));
    }
}