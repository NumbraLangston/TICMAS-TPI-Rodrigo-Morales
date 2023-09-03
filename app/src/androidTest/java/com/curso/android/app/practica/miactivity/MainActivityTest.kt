package com.curso.android.app.practica.miactivity

import androidx.test.platform.app.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(androidx.test.ext.junit.runners.AndroidJUnit4::class)
class MainActivityTest {
    @get: Rule
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java )

    @Before
    fun setUp() {

    }

    @After
    fun tearDown() {

    }
    @Test
    fun mainActivity_CompararTextos(){
        Espresso.onView(ViewMatchers.withId(R.id.botonComparar))
            .perform(ViewActions.click())

        Espresso.onView(ViewMatchers.withId(R.id.textoVista)).check(ViewAssertions.matches(
            ViewMatchers.withText("Los textos ingresados son iguales")
        ))


    }
}