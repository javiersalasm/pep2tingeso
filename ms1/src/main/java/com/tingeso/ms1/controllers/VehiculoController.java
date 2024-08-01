package com.tingeso.ms1.controllers;

import com.tingeso.ms1.entities.VehiculoEntity;
import com.tingeso.ms1.services.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {

    @Autowired
    VehiculoService vehiculoService;

    @PostMapping("/crear")
    public ResponseEntity<VehiculoEntity> crearVehiculo(@RequestBody VehiculoEntity vehiculo) {
        VehiculoEntity newVehiculo = vehiculoService.crearVehiculo(vehiculo);
        return new ResponseEntity<>(newVehiculo, HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<VehiculoEntity>> getAllVehiculos() {
        List<VehiculoEntity> vehiculosList = vehiculoService.getAllVehiculos();
        return ResponseEntity.ok(vehiculosList);
    }


    

}
