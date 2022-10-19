package com.certus.demo.models.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.certus.demo.models.Productos;

@Component

public class ProductosService implements IProductosService{
	
	@Override
	public List<Productos>  LisProductos() {
		
		Productos nuevoProductos = new Productos();
		
		List<Productos> LisProductos = new ArrayList<>();
		nuevoProductos.setNombre("Pantalla");
		nuevoProductos.setDescripcion("Descripción");
		nuevoProductos.setImagen("imagen");
		nuevoProductos.setPrecio(0);
		
		return LisProductos;
	}

}
