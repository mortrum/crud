package hromjak.robert.filmography.service;

import hromjak.robert.filmography.dao.FilmDAO;
import hromjak.robert.filmography.dao.FilmDAOImpl;
import hromjak.robert.filmography.model.Film;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {
    private FilmDAO filmDAO = new FilmDAOImpl();

    @Transactional
    @Override
    public List<Film> allFilms() {
        return filmDAO.allFilms();
    }

    @Transactional
    @Override
    public void add(Film film) {
        filmDAO.add(film);
    }

    @Transactional
    @Override
    public void delete(Film film) {
        filmDAO.delete(film);
    }

    @Transactional
    @Override
    public void edit(Film film) {
        filmDAO.edit(film);
    }

    @Transactional
    @Override
    public Film getById(int id) {
        return filmDAO.getById(id);
    }
}