package com.tingeso.ms1.services;

import com.tingeso.ms1.entities.VehiculoEntity;
import com.tingeso.ms1.repositories.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculoService {

    @Autowired
    VehiculoRepository vehiculoRepository;

    public VehiculoService(VehiculoRepository vehiculoRepository) {
        this.vehiculoRepository = vehiculoRepository;
    }

    public List<VehiculoEntity> getAllVehiculos() {
        return vehiculoRepository.findAll();
    }

    public Optional<VehiculoEntity> getVehiculoById(Long id) {
        return vehiculoRepository.findById(id);
    }

    public Optional<VehiculoEntity> getVehiculoByPatente(String patente) {
        return vehiculoRepository.findVehiculoByPatente(patente);
    }

    public VehiculoEntity crearVehiculo(VehiculoEntity vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }



}
