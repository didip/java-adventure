/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package mysparkjava;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App app = new App();
        assertNotNull("app should have a greeting", app.rootString());
        assertThat(app.rootString().toLowerCase(), containsString("hello world"));
    }
}
