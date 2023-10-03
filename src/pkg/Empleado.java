package pkg;

public class Empleado {

	public enum TipoEmpleado{Vendedor, Encargado};
	
	public float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		
		float salarioBase = 0;
		
		if(tipo.equals(TipoEmpleado.Vendedor)) {
			salarioBase = 2000;
		}else {
			salarioBase = 2500;
		}
		
		if(ventasMes >= 1500)
			salarioBase +=200;
		else if(ventasMes >= 1000)
			salarioBase +=100;
		
		salarioBase += horasExtra*30;
		
		return salarioBase;
	}
	
	public float calculoNominaNeta(float nominaBruta) {
		
		float retencion = 0;
		
		if(nominaBruta > 2100 && nominaBruta < 2500) {
			retencion = 1-0.15f;
		}else if(nominaBruta > 2500) {
			retencion = 1-0.18f;
		}
		return nominaBruta*retencion;
	}
}
