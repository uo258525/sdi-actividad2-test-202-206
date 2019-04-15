import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class dfsdf {
	@Before
	public void setUp() {
//		driver.navigate().to(URL);
	}

	// Después de cada prueba se borran las cookies del navegador
	@After
	public void tearDown() {
//		driver.manage().deleteAllCookies();
	}

	// Antes de la primera prueba
	@BeforeClass
	static public void begin() {
	}

	// Al finalizar la última prueba
	// Cerramos el navegador al finalizar las pruebas
	@AfterClass
	static public void end() {
//		driver.quit();
	}

	/**
	 * Registro de Usuario con datos válidos.
	 */
	@Test
	public void Test01_1_RegVal() {
		Assert.assertTrue(true);
	}
}
