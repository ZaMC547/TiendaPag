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
		Productos nuevoProductos2 = new Productos();
		Productos nuevoProductos3 = new Productos();
		Productos nuevoProductos4 = new Productos();
		Productos nuevoProductos5 = new Productos();
		Productos nuevoProductos6 = new Productos();
		
		
		List<Productos> LisProductos = new ArrayList<>();
		nuevoProductos.setNombre("Pantalla");
		nuevoProductos.setDescripcion("Descripción");
		nuevoProductos.setImagen("imagen");
		nuevoProductos.setPrecio(78);
		
		nuevoProductos2.setNombre("Telefono"); 
		nuevoProductos2.setDescripcion("8G");
		nuevoProductos2.setImagen("imagen");
		nuevoProductos2.setPrecio(98);
		
		nuevoProductos3.setNombre("PC"); 
		nuevoProductos3.setDescripcion("Buen estado");
		nuevoProductos3.setImagen("imagen");
		nuevoProductos3.setPrecio(608);
		
		nuevoProductos4.setNombre("Libros"); 
		nuevoProductos4.setDescripcion("De rayas");
		nuevoProductos4.setImagen("imagen");
		nuevoProductos4.setPrecio(78);
		
		nuevoProductos5.setNombre("Telefono2"); 
		nuevoProductos5.setDescripcion("8G3");
		nuevoProductos5.setImagen("imagen");
		nuevoProductos5.setPrecio(982);
		
		nuevoProductos6.setNombre("Telefono6"); 
		nuevoProductos6.setDescripcion("8G0");
		nuevoProductos6.setImagen("imagen");
		nuevoProductos6.setPrecio(987);
		
		LisProductos.add(nuevoProductos);
		LisProductos.add(nuevoProductos2);
		LisProductos.add(nuevoProductos3);
		LisProductos.add(nuevoProductos4);
		LisProductos.add(nuevoProductos5);
		LisProductos.add(nuevoProductos6);
		
		return LisProductos;
	}

}
