////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.example.android20;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import android.content.Context; import androidx.test.platform.app.InstrumentationRegistry; import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Test; import org.junit.runner.RunWith; import static org.junit.Assert.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/** This is a instrumented test, which will execute on an Android device (AVD)
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a> */

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

@RunWith(AndroidJUnit4.class) public class ExampleInstrumentedTest {

    @Test  public void useAppContext() { Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.android20", appContext.getPackageName());
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////