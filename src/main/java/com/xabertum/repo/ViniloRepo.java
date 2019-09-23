package com.xabertum.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xabertum.model.Vinilo;

public interface ViniloRepo extends JpaRepository<Vinilo, String> {
	
	List<Vinilo> findByTituloVinilo(String tituloVinilo);
	List<Vinilo> findByFechaEdicion(String fechaEdicion);
	

}
