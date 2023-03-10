/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tarea1.repository;
import com.tarea1.entity.Productos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Diker Hidalgo
 */
@Repository
public interface ProductosRepository extends CrudRepository<Productos, Long>{
    
}
