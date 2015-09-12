package edu.tamu.ctv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.tamu.ctv.entity.Rowheaders;

@Repository
public interface RowHeadersRepository extends CrudRepository<Rowheaders, Long>
{
	@Query("from Rowheaders as res inner join res.rowtypes rt inner join rt.projects p where res.code = :code and p.code = :projectCode")
	List<Rowheaders> findByCodeAndRowTypesProjectsCode(@Param("code")String code, @Param("projectCode")String projectCode);
}
