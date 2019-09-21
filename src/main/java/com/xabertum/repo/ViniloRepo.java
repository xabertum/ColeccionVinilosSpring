package com.xabertum.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.xabertum.model.Vinilo;

import java.util.List;

public interface ViniloRepo extends JpaRepository<Vinilo, String> {
	
	List<Vinilo> findByTituloVinilo(String tituloVinilo);
	List<Vinilo> findByFechaEdicion(String fechaEdicion);

}
