package db.repositorys;

import java.util.List;

import interfaces.RepositoryInterface;
import models.Empleado;

public class EmpleadoRepository implements RepositoryInterface<Empleado>{

    @Override
    public Empleado recuperaId(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'recuperaId'");
    }

    @Override
    public List<Empleado> recuperarTodos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'recuperarTodos'");
    }

    @Override
    public void agregar(Empleado entidad) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregar'");
    }

    @Override
    public void modificar(Empleado entidad) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificar'");
    }

    @Override
    public void eliminar(Empleado entidad) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }
}
