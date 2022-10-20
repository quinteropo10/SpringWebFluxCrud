package com.example.crud_webflux.documents;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Document(collection = "clientes")
@Data
public class Cliente {

    @Id
    private String id;

    @NotEmpty
    private String nombre;

    @NotEmpty
    private String apellido;

    @NotNull
    private Integer edad;

    @NotNull
    private Double sueldo;
    private String foto;


    public Cliente(String nombre, String apellido, Integer edad, Double sueldo, String foto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sueldo = sueldo;
        this.foto = foto;
    }


}
