package com.producto.api.dto;
import java.util.List;
import com.producto.api.modeloBase.ResponseGenericoDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoResponseDTO extends ResponseGenericoDTO {
	
	private List<ProductoDTO> producto;

}
