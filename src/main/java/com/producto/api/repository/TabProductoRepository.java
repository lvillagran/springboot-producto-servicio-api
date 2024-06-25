package com.producto.api.repository;


import com.producto.api.model.TabProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface TabProductoRepository extends JpaRepository<TabProducto, Long> {
	
	/** Nota:
	 Opcion 1: Podemos usar: Optional<TabProducto> findById(String id);
	 Opcion 2: Query:  @Query( "select u from where id = :id " )
	 */
	
	
	/** Consulta productos por Id */
    @Query( " select m.id " +
            ", m.nombre" +
            ", m.descripcion " +
            ", m.precio " +
            ", m.estado " +
            ", m.fechaResgistro " +
            " from TabProducto m where m.id = :id " )
    List<Object[]> consultaProductosPorId(@Param("id") Long id);

}
