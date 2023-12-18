//package com.moderneinstein.android.examples ; //arcade;
package com.moderneinstein.android.examples ;  
import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.moderneinstein.android.arcade.RootActivityTest \
 * com.moderneinstein.android.arcade.tests/android.test.InstrumentationTestRunner
 */
public class RootActivityTest extends ActivityInstrumentationTestCase2<RootActivity> {
    
    // super("com.moderneinstein.android.arcade", RootActivity.class);
    public RootActivityTest() {
        super("com.moderneinstein.android.examples", RootActivity.class);
    }

}
