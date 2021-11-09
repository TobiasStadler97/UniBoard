package UniBoard.service;

import UniBoard.entity.graphic.FacultyGC;
import UniBoard.repository.FacultyGCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacultyGCService {
    @Autowired
    private FacultyGCRepository facultyGCRepository;

    public List<FacultyGC> findAll() {
        return facultyGCRepository.findAll();
    }

    public List<FacultyGC> findAll(Sort sort) {
        return facultyGCRepository.findAll(sort);
    }

    public List<FacultyGC> findAllById(Iterable<Integer> integers) {
        return facultyGCRepository.findAllById(integers);
    }

    public <S extends FacultyGC> List<S> saveAll(Iterable<S> entities) {
        return facultyGCRepository.saveAll(entities);
    }

    public void flush() {
        facultyGCRepository.flush();
    }

    public <S extends FacultyGC> S saveAndFlush(S entity) {
        return facultyGCRepository.saveAndFlush(entity);
    }

    public <S extends FacultyGC> List<S> saveAllAndFlush(Iterable<S> entities) {
        return facultyGCRepository.saveAllAndFlush(entities);
    }

    @Deprecated
    public void deleteInBatch(Iterable<FacultyGC> entities) {
        facultyGCRepository.deleteInBatch(entities);
    }

    public void deleteAllInBatch(Iterable<FacultyGC> entities) {
        facultyGCRepository.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        facultyGCRepository.deleteAllByIdInBatch(integers);
    }

    public void deleteAllInBatch() {
        facultyGCRepository.deleteAllInBatch();
    }

    @Deprecated
    public FacultyGC getOne(Integer integer) {
        return facultyGCRepository.getOne(integer);
    }

    public FacultyGC getById(Integer integer) {
        return facultyGCRepository.getById(integer);
    }

    public <S extends FacultyGC> List<S> findAll(Example<S> example) {
        return facultyGCRepository.findAll(example);
    }

    public <S extends FacultyGC> List<S> findAll(Example<S> example, Sort sort) {
        return facultyGCRepository.findAll(example, sort);
    }

    public Page<FacultyGC> findAll(Pageable pageable) {
        return facultyGCRepository.findAll(pageable);
    }

    public <S extends FacultyGC> S save(S entity) {
        return facultyGCRepository.save(entity);
    }

    public Optional<FacultyGC> findById(Integer integer) {
        return facultyGCRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return facultyGCRepository.existsById(integer);
    }

    public long count() {
        return facultyGCRepository.count();
    }

    public void deleteById(Integer integer) {
        facultyGCRepository.deleteById(integer);
    }

    public void delete(FacultyGC entity) {
        facultyGCRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        facultyGCRepository.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends FacultyGC> entities) {
        facultyGCRepository.deleteAll(entities);
    }

    public void deleteAll() {
        facultyGCRepository.deleteAll();
    }

    public <S extends FacultyGC> Optional<S> findOne(Example<S> example) {
        return facultyGCRepository.findOne(example);
    }

    public <S extends FacultyGC> Page<S> findAll(Example<S> example, Pageable pageable) {
        return facultyGCRepository.findAll(example, pageable);
    }

    public <S extends FacultyGC> long count(Example<S> example) {
        return facultyGCRepository.count(example);
    }

    public <S extends FacultyGC> boolean exists(Example<S> example) {
        return facultyGCRepository.exists(example);
    }
}
