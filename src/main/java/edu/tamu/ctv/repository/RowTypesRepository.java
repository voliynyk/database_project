package edu.tamu.ctv.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import edu.tamu.ctv.entity.Rowtypes;

@Repository
public interface RowTypesRepository extends CrudRepository<Rowtypes, Long>
{
	List<Rowtypes> findByProjectsCode(String pCode);
}
