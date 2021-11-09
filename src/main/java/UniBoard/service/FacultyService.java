package UniBoard.service;

import UniBoard.entity.domaindata.Faculty;
import UniBoard.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacultyService {
    @Autowired
    private FacultyRepository facultyRepository;

    public List<Faculty> findAll() {
        return facultyRepository.findAll();
    }

    public List<Faculty> findAll(Sort sort) {
        return facultyRepository.findAll(sort);
    }

    public List<Faculty> findAllById(Iterable<Integer> integers) {
        return facultyRepository.findAllById(integers);
    }

    public <S extends Faculty> List<S> saveAll(Iterable<S> entities) {
        return facultyRepository.saveAll(entities);
    }

    public void flush() {
        facultyRepository.flush();
    }

    public <S extends Faculty> S saveAndFlush(S entity) {
        return facultyRepository.saveAndFlush(entity);
    }

    public <S extends Faculty> List<S> saveAllAndFlush(Iterable<S> entities) {
        return facultyRepository.saveAllAndFlush(entities);
    }

    @Deprecated
    public void deleteInBatch(Iterable<Faculty> entities) {
        facultyRepository.deleteInBatch(entities);
    }

    public void deleteAllInBatch(Iterable<Faculty> entities) {
        facultyRepository.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        facultyRepository.deleteAllByIdInBatch(integers);
    }

    public void deleteAllInBatch() {
        facultyRepository.deleteAllInBatch();
    }

    @Deprecated
    public Faculty getOne(Integer integer) {
        return facultyRepository.getOne(integer);
    }

    public Faculty getById(Integer integer) {
        return facultyRepository.getById(integer);
    }

    public <S extends Faculty> List<S> findAll(Example<S> example) {
        return facultyRepository.findAll(example);
    }

    public <S extends Faculty> List<S> findAll(Example<S> example, Sort sort) {
        return facultyRepository.findAll(example, sort);
    }

    public Page<Faculty> findAll(Pageable pageable) {
        return facultyRepository.findAll(pageable);
    }

    public <S extends Faculty> S save(S entity) {
        return facultyRepository.save(entity);
    }

    public Optional<Faculty> findById(Integer integer) {
        return facultyRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return facultyRepository.existsById(integer);
    }

    public long count() {
        return facultyRepository.count();
    }

    public void deleteById(Integer integer) {
        facultyRepository.deleteById(integer);
    }

    public void delete(Faculty entity) {
        facultyRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        facultyRepository.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends Faculty> entities) {
        facultyRepository.deleteAll(entities);
    }

    public void deleteAll() {
        facultyRepository.deleteAll();
    }

    public <S extends Faculty> Optional<S> findOne(Example<S> example) {
        return facultyRepository.findOne(example);
    }

    public <S extends Faculty> Page<S> findAll(Example<S> example, Pageable pageable) {
        return facultyRepository.findAll(example, pageable);
    }

    public <S extends Faculty> long count(Example<S> example) {
        return facultyRepository.count(example);
    }

    public <S extends Faculty> boolean exists(Example<S> example) {
        return facultyRepository.exists(example);
    }
}
