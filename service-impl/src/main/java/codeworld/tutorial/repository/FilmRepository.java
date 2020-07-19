package codeworld.tutorial.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import codeworld.tutorial.entity.FilmEntity;

/**
 * @author h.kanure
 *
 */
@Repository
public interface FilmRepository extends CrudRepository<FilmEntity, Long> {

}
