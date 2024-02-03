import java.util.List;

import db.conexion.ConexionDB;
import db.repositorys.EmpleadoRepository;
import db.repositorys.GenerosRepository;
import models.Empleado;
import models.Genero;

public class App {
    public static void main(String[] args) {
        GenerosRepository generosRepository = new GenerosRepository();
        EmpleadoRepository empleadosRepository = new EmpleadoRepository();
        //Genero g = generosRepository.recuperaId(2L);
        //Empleado e = new Empleado(null, "Pedro", "Palacio Nacional", "99-11", "fkjfbaQ@gmail.com",  null, g );
        //empleadosRepository.agregar(e);

        //Genero genero = generosRepository.recuperaId(4L);
        //generosRepository.eliminar(genero);
        //Empleado emp = empleadosRepository.recuperaId(11L);
        //empleadosRepository.eliminar(emp);

        //Genero g = generosRepository.recuperaId(1L);
        //g.setNombre("Mujer");
        //generosRepository.modificar(g);
        Empleado emp = empleadosRepository.recuperaId(5L);
        emp.setNombre("Juan");
        empleadosRepository.modificar(emp);

        List<Empleado> empleados = empleadosRepository.recuperarTodos();
        for (Empleado empleadoL : empleados)
        {
            System.out.println(empleadoL.getNombre());
        }
        
    }
}