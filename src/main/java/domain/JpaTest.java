package domain;

import java.util.List;
import java.sql.Date;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


public class JpaTest {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction tx = manager.getTransaction();
		
		tx.begin();
		
		Empleado e = new Empleado();
		e.setApeMat("Rosales");
		e.setApePat("Poma");
		e.setFechaNacimiento(Date.valueOf("1995-02-14"));
		e.setNombres("Luis");
		e.setNroHijos(0);
		e.setSueldo(4000.0);
		
		
		
		// CREAR
		manager.persist(e);
		
		tx.commit();
		
		
		List<Empleado> lista = manager.createQuery("from Emp", Empleado.class).getResultList();
		for (Empleado empleado : lista) {
			System.out.println(empleado);
		}
		
		
		tx.begin();
		
		//MODIFICAR
		
		Empleado empleado = manager.find(Empleado.class, 1);
		System.out.println(empleado);
		empleado.setNombres("Luis Alejandro");
		manager.getTransaction().commit();
		
		lista = manager.createQuery("from Emp", Empleado.class).getResultList();
		for (Empleado empleadoModifica : lista) {
			System.out.println(empleadoModifica);
		}
		
		
		
		//BORRAR
		
		manager.getTransaction().begin();

		Empleado empleadoDelete = manager.find(Empleado.class, 1);
		manager.remove(empleadoDelete);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		
		
		
	}

}
