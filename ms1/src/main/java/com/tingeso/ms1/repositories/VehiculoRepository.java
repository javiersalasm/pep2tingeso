package com.tingeso.ms1.repositories;

import com.tingeso.ms1.entities.VehiculoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VehiculoRepository extends JpaRepository<VehiculoEntity, Long> {
    Optional<VehiculoEntity> findVehiculoByPatente(String patente);

}
