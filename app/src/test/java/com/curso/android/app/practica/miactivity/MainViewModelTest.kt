package com.curso.android.app.practica.miactivity

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.*
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MainViewModelTest {

    private lateinit var viewModel: MainViewModel

    @get:Rule
    val instantTaskRule = InstantTaskExecutorRule()
    private val dispatcher = StandardTestDispatcher()

    @Before
    fun setup() {
        viewModel = MainViewModel()
    }

    @Test
    fun mainViewModel_checkInitialValues() = runTest{
        val value = viewModel.textos.value?.a
        assertEquals("",value)

        val value2 = viewModel.textos.value?.b
        assertEquals("",value2)

    }

    @Test
    fun mainViewModel_CompararTextos() = runTest{

            val value = "Buen dia"
            val value2 = "Buenas tardes"


        var valueComparacion = viewModel.compararTextos(value.toString(),value.toString())
        assertEquals("Los textos ingresados son iguales",valueComparacion)


        valueComparacion = viewModel.compararTextos(value.toString(),value2.toString())
        assertEquals("Los textos ingresados son distintos",valueComparacion)
    }
    @After
    fun tearDown(){
        Dispatchers.resetMain()
    }
}