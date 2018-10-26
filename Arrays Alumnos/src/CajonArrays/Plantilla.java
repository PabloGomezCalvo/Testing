package CajonArrays;
import java.util.*;



public class Plantilla {


	private ArrayList<Empleado> empleados;
	
	public Plantilla() {
		empleados= new ArrayList<Empleado>();
	}

	public void add(Empleado est)	{
		empleados.add(est);
	}
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}


	public ArrayList<String> getEmpleados1825() {

		 ArrayList<String> empleadosRet =  new ArrayList<String>();
		for(int i=0;i< empleados.length(); i++){
			if(empleados[i].getEdad() >18 && empleados[i].getEdad() <25)
			{
				empleadosRet.add(empleados[i].getDNI());

			}
		}
		return empleadosRet;
		
	}

	
	public Empleado getEmpleadoPorDNI(String DNI) {
		for(int i=0;i< empleados.length(); i++){
			if(empleados[i].getDNI().equals(DNI))
				return empleados[i];
		}
	}

	
	public String getEmpleadoDepartamento(String DNI) {
		Departamentos tmp = Departamentos.getInstance( );
		for(int i=0;i< empleados.length(); i++){
			if(empleados[i].getDNI().equals(DNI)){
				String s= empleados[i].getDept();
				return tmp.getDept(s);
			}
			}

		}
	

	
	public ArrayList<Empleado> getEmpleadosPorEdadSexo(int minEdad,	String sexo) {
		ArrayList<Empleado> empleadosRet =  new ArrayList<Empleado>();
		for(int i=0;i< empleados.length(); i++){
			if(empleados[i].getEdad() >minEdad && empleados[i].getSexo().equals (sexo))
			{
				empleadosRet.add(empleados[i]);

			}
		}
		return empleadosRet;
		
	}


}