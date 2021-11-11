package UniBoard.service;

import UniBoard.entity.users.Professor;
import UniBoard.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository professorRepository;

    public List<Professor> findAll() {
        return professorRepository.findAll();
    }

    public List<Professor> findAll(Sort sort) {
        return professorRepository.findAll(sort);
    }

    public List<Professor> findAllById(Iterable<Integer> integers) {
        return professorRepository.findAllById(integers);
    }

    public <S extends Professor> List<S> saveAll(Iterable<S> entities) {
        return professorRepository.saveAll(entities);
    }

    public void flush() {
        professorRepository.flush();
    }

    public <S extends Professor> S saveAndFlush(S entity) {
        return professorRepository.saveAndFlush(entity);
    }

    public <S extends Professor> List<S> saveAllAndFlush(Iterable<S> entities) {
        return professorRepository.saveAllAndFlush(entities);
    }

    @Deprecated
    public void deleteInBatch(Iterable<Professor> entities) {
        professorRepository.deleteInBatch(entities);
    }

    public void deleteAllInBatch(Iterable<Professor> entities) {
        professorRepository.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        professorRepository.deleteAllByIdInBatch(integers);
    }

    public void deleteAllInBatch() {
        professorRepository.deleteAllInBatch();
    }

    @Deprecated
    public Professor getOne(Integer integer) {
        return professorRepository.getOne(integer);
    }

    public Professor getById(Integer integer) {
        return professorRepository.getById(integer);
    }

    public <S extends Professor> List<S> findAll(Example<S> example) {
        return professorRepository.findAll(example);
    }

    public <S extends Professor> List<S> findAll(Example<S> example, Sort sort) {
        return professorRepository.findAll(example, sort);
    }

    public Page<Professor> findAll(Pageable pageable) {
        return professorRepository.findAll(pageable);
    }

    public <S extends Professor> S save(S entity) {
        return professorRepository.save(entity);
    }

    public Optional<Professor> findById(Integer integer) {
        return professorRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return professorRepository.existsById(integer);
    }

    public long count() {
        return professorRepository.count();
    }

    public void deleteById(Integer integer) {
        professorRepository.deleteById(integer);
    }

    public void delete(Professor entity) {
        professorRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        professorRepository.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends Professor> entities) {
        professorRepository.deleteAll(entities);
    }

    public void deleteAll() {
        professorRepository.deleteAll();
    }

    public <S extends Professor> Optional<S> findOne(Example<S> example) {
        return professorRepository.findOne(example);
    }

    public <S extends Professor> Page<S> findAll(Example<S> example, Pageable pageable) {
        return professorRepository.findAll(example, pageable);
    }

    public <S extends Professor> long count(Example<S> example) {
        return professorRepository.count(example);
    }

    public <S extends Professor> boolean exists(Example<S> example) {
        return professorRepository.exists(example);
    }
}
