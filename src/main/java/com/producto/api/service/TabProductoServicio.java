package com.producto.api.service;

import com.producto.api.dto.ProductoDTO;
import com.producto.api.model.TabProducto;
import com.producto.api.repository.TabProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TabProductoServicio {

	@Autowired
	private TabProductoRepository tabProductoRepository;

	/** Registra */
	public void registrar(TabProducto productos) {
		tabProductoRepository.save(productos);
	}

	
	/** Devuelve lista todos los productos */
	 public List<ProductoDTO> findAll() {
	        List<TabProducto> resultObj =  tabProductoRepository.findAll();
	        return convertirProductoDTOAll(resultObj);
	    }
	
	 
	 /** Devuelve lista productos por Id */
	    public List<ProductoDTO> consultaProductosPorId(Long id) {
	        List<Object[]> resultObj = tabProductoRepository.consultaProductosPorId(id);
	        return convertirProductoDTOPorId(resultObj);
	    }
	    
	    
	    /** Actualiza producto por Id */
	    public void actualizarProducto(TabProducto producto){
			 tabProductoRepository.save(producto);
	    }

		/** Eliminar */
	public void deleteProducto(TabProducto producto){
		tabProductoRepository.save(producto);
	}
	    
	    
	    /** Metodos mapeo DTO para consultas */
	 public List<ProductoDTO> convertirProductoDTOAll(List<TabProducto> resultObj) {
	        return resultObj.stream().map(lData -> {
	        	ProductoDTO productoDTO = new ProductoDTO();
	        	productoDTO.setId(lData.getId());
	        	productoDTO.setNombre(lData.getNombre().trim());
	        	productoDTO.setDescripcion(lData.getDescripcion().trim());
	        	productoDTO.setPrecio(lData.getPrecio());
	        	productoDTO.setEstado(lData.getEstado().trim());
	        	productoDTO.setFechaRegistro(lData.getFechaResgistro());
	            return productoDTO;
	        }).collect(Collectors.toList());
	    }


	 /** Combierte de List<Object[]> a productoDTO */
	 public List<ProductoDTO> convertirProductoDTOPorId(List<Object[]> resultObj) {
	        return resultObj.stream().map(lData -> {
	        	ProductoDTO productoDTO = new ProductoDTO();
	        	productoDTO.setId(Long.parseLong(lData[0].toString()));
	        	productoDTO.setNombre(lData[1].toString());
	        	productoDTO.setDescripcion(lData[2].toString());
				productoDTO.setPrecio(Double.parseDouble(lData[3].toString()));
	        	productoDTO.setEstado(lData[4].toString());
	        	productoDTO.setFechaRegistro((Date) lData[5]);
	            return productoDTO;
	        }).collect(Collectors.toList());
	    }
	 
}
