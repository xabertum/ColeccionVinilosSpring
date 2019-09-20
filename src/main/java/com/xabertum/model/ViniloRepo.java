package com.xabertum.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ViniloRepo extends CrudRepository<Vinilo, String> {
	
	List<Vinilo> findByTituloVinilo(String tituloVinilo);
	Vinilo findByFechaEdicion(String fechaEdicion);

}
