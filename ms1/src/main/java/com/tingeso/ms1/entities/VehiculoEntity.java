package com.tingeso.ms1.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "vehiculo")
public class VehiculoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String patente;

    private String marca;
    private String modelo;
    private String tipoVehiculo;
    private int anioFabricacion;
    private String tipoMotor;
    private int numAsientos;
    private int kilometros;

}
