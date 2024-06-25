package com.producto.api.controllers;

import com.producto.api.dto.ProductoDTO;
import com.producto.api.dto.ProductoRequestDTO;
import com.producto.api.dto.ProductoResponseDTO;
import com.producto.api.model.TabProducto;
import com.producto.api.service.TabProductoServicio;
import com.producto.api.utils.Constantes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/mantenimiento/producto-service")
public class TabProductoController {

	@Autowired
	private TabProductoServicio tabProductoServicio;

	/**
	 * Registra prodcucto
	 */
	/** URL: http://localhost:8080/api/v1/mantenimiento/producto-service/registrar */
	/** { "nombre":"CAFE", "descripcion":"CAFE 250 GR", "precio":"1.25", "observacion":"NUEVO REGISTRO"} */
	@PostMapping("/registrar")
	public ResponseEntity<ProductoResponseDTO> registraProducto(@Validated @RequestBody ProductoRequestDTO request) {
		ProductoResponseDTO productoResponseDTO = new ProductoResponseDTO();
		TabProducto producto = new TabProducto();

		try {
			producto.setNombre(request.getNombre().toString().trim());
			producto.setDescripcion(request.getDescripcion().toString().trim());
			producto.setPrecio(request.getPrecio());
			producto.setEstado(Constantes.ACTIVO);
			producto.setFechaResgistro(new Date());
			tabProductoServicio.registrar(producto);

			productoResponseDTO.setMensaje(Constantes.TRANSACCION_EXITOSA);
			return ResponseEntity.ok(productoResponseDTO);

		} catch (Exception e) {
			System.out.println("ERROR: " + e.getStackTrace());
			productoResponseDTO.setMensaje(Constantes.ERROR_REGISTRAR);
			return ResponseEntity.status(500).body(productoResponseDTO);
		}
	}


	/**
	 * Consulta lista de productos
	 */
	/** URL: http://localhost:8080/api/v1/mantenimiento/producto-service/listadoProductos */
	@PostMapping("/listadoProductos")
	public ResponseEntity<ProductoResponseDTO> productosAll() {
		ProductoResponseDTO productoResponseDTO = new ProductoResponseDTO();

		try {
		List<ProductoDTO> listaProducto = tabProductoServicio.findAll();
		productoResponseDTO.setProducto(listaProducto);
		productoResponseDTO.setMensaje(Constantes.TRANSACCION_EXITOSA);
		return ResponseEntity.ok(productoResponseDTO);

	} catch (Exception e) {
		System.out.println("ERROR: " + e.getStackTrace());
		productoResponseDTO.setMensaje(Constantes.ERROR_LISTAR);
		return ResponseEntity.status(500).body(productoResponseDTO);
	 }
	}


	/**
	 * Actualizacion de producto por Id
	 */
	/** URL:  http://localhost:8080/api/v1/mantenimiento/producto-service/update */
	/** { "id":18, "precio":"100" } */
	@PutMapping("/update")
	public ResponseEntity<ProductoResponseDTO> updateProducto(@Validated @RequestBody ProductoRequestDTO request) {

		ProductoResponseDTO productoResponseDTO = new ProductoResponseDTO();

		try {
			List<ProductoDTO> resultProducto = tabProductoServicio.consultaProductosPorId(request.getId());

			if (resultProducto == null || resultProducto.isEmpty()) {
				productoResponseDTO.setMensaje(Constantes.REGISTRO_NO_ENCONTRADO);
				return ResponseEntity.status(404).body(productoResponseDTO);
			} else {
				TabProducto producto = new TabProducto();
				producto.setId(resultProducto.get(0).getId());
				producto.setEstado(resultProducto.get(0).getEstado());
				producto.setFechaResgistro(resultProducto.get(0).getFechaRegistro());
				producto.setDescripcion(resultProducto.get(0).getDescripcion());
				producto.setNombre(resultProducto.get(0).getNombre());

				/** Actulizo el precio */
				producto.setPrecio(request.getPrecio());

				tabProductoServicio.actualizarProducto(producto);
				productoResponseDTO.setMensaje(Constantes.TRANSACCION_EXITOSA);
				return ResponseEntity.ok(productoResponseDTO);
			}
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getStackTrace());
			productoResponseDTO.setMensaje(Constantes.ERROR_ACTUALIZAR);
			return ResponseEntity.status(500).body(productoResponseDTO);
		}
	}


	/** Eliminacion de registro de forma logica */
	/** URL:  http://localhost:8080/api/v1/mantenimiento/producto-service/delete */
	/** { "id":28 } */
	@PutMapping("/delete")
	public ResponseEntity<ProductoResponseDTO> deleteProducto(@Validated @RequestBody ProductoRequestDTO request) {

		ProductoResponseDTO productoResponseDTO = new ProductoResponseDTO();

		try {
			List<ProductoDTO> resultProducto = tabProductoServicio.consultaProductosPorId(request.getId());

			if (resultProducto == null || resultProducto.isEmpty()) {
				productoResponseDTO.setMensaje(Constantes.REGISTRO_NO_ENCONTRADO);
				return ResponseEntity.status(404).body(productoResponseDTO);
			} else {
				TabProducto producto = new TabProducto();
				producto.setId(resultProducto.get(0).getId());
				producto.setFechaResgistro(resultProducto.get(0).getFechaRegistro());
				producto.setDescripcion(resultProducto.get(0).getDescripcion());
				producto.setNombre(resultProducto.get(0).getNombre());
				producto.setPrecio(resultProducto.get(0).getPrecio());
				producto.setEstado(Constantes.ELIMINADO);

				tabProductoServicio.deleteProducto(producto);
				productoResponseDTO.setMensaje(Constantes.TRANSACCION_EXITOSA);
				return ResponseEntity.ok(productoResponseDTO);
			}
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getStackTrace());
			productoResponseDTO.setMensaje(Constantes.ERROR_ACTUALIZAR);
			return ResponseEntity.status(500).body(productoResponseDTO);
		}
	}
}
