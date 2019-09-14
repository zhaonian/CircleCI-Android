package io.zluan.circleciandroid

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * The Rule will make sure to launch the MainActivity directly. This means that when testing an
 * n-layer activity, you don’t need to do all the steps to start it. Simply define that in the rule
 * and you are ready to go.
 */
@RunWith(AndroidJUnit4::class)
class ItemListActivityTest {

    @get:Rule val activityTestRule = ActivityTestRule<ItemListActivity>(ItemListActivity::class.java)

    @Test fun toolBar_showAppTitle() {
        onView(withId(R.id.toolbar)).check(matches(isDisplayed()))
        onView(withText(R.string.app_name)).check(matches(withParent(withId(R.id.toolbar))))
    }
}
