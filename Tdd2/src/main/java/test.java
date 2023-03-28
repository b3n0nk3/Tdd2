import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class test {

	@Test
	public void test_al_crear_un_coche_su_velocidad_es_cero_Angel_Fuentes() {
		Coche nuevoCoche = new Coche();
		Assertions.assertEquals(0, nuevoCoche.velocidad);
	}
	
	@Test
	public void test_al_acelerar_un_coche_su_velocidad_aumenta_Angel_Fuentes() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.acelerar_Angel_Fuentes(30);
		Assertions.assertEquals(30, nuevoCoche.velocidad);
	}
	
	@Test
	public void test_al_decelerar_un_coche_su_velocidad_disminuye__Angel_Fuentes() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.velocidad = 50;
		nuevoCoche.decelere_Angel_Fuentes(30);
		Assertions.assertEquals(20, nuevoCoche.velocidad);
	}
	
	@Test
	public void test_al_decelerar_un_coche_su_velocidad_no_puede_ser_menor_de_cero_Angel_Fuentes() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.velocidad = 50;
		nuevoCoche.decelere_Angel_Fuentes(80);
		Assertions.assertEquals(0, nuevoCoche.velocidad);
	}

}
