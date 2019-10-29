package com.xabertum.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import com.xabertum.model.Vinilo;

public interface ViniloRepo extends JpaRepository<Vinilo, String>, QueryByExampleExecutor<Vinilo> {
	
	List<Vinilo> findByTituloVinilo(String tituloVinilo);
	List<Vinilo> findByFechaEdicion(String fechaEdicion);
	

}
