/**
 *
 */
package codeworld.tutorial.impl;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import codeworld.tutorial.dto.Film;
import codeworld.tutorial.entity.FilmEntity;
import codeworld.tutorial.repository.FilmRepository;
import codeworld.tutorial.service.FilmService;

/**
 * @author h.kanure
 *
 */
@Service
@Transactional
public class FilmServiceImpl implements FilmService {

    @Resource
    private FilmRepository filmRepository;

    @Override
    public List<Film> findAll() {
        List<FilmEntity> entities = (List<FilmEntity>) filmRepository.findAll();
        return entities.stream()
                .map(this::converToDto)
                .collect(Collectors.toList());
    }

    private Film converToDto(FilmEntity entity) {
        Film film = new Film();
        film.setId(entity.getId());
        film.setDescription(entity.getDescription());
        film.setFeatures(entity.getFeatures());
        film.setRating(entity.getRating());
        film.setTitle(entity.getTitle());
        film.setReleaseDate(entity.getReleaseYear());
        return film;
    }

}
