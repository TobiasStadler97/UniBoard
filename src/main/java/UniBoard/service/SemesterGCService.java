package UniBoard.service;

import UniBoard.entity.graphic.SemesterGC;
import UniBoard.repository.SemesterGCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SemesterGCService {
    @Autowired
    private SemesterGCRepository semesterGCRepository;

    public List<SemesterGC> findAll() {
        return semesterGCRepository.findAll();
    }

    public List<SemesterGC> findAll(Sort sort) {
        return semesterGCRepository.findAll(sort);
    }

    public List<SemesterGC> findAllById(Iterable<Integer> integers) {
        return semesterGCRepository.findAllById(integers);
    }

    public <S extends SemesterGC> List<S> saveAll(Iterable<S> entities) {
        return semesterGCRepository.saveAll(entities);
    }

    public void flush() {
        semesterGCRepository.flush();
    }

    public <S extends SemesterGC> S saveAndFlush(S entity) {
        return semesterGCRepository.saveAndFlush(entity);
    }

    public <S extends SemesterGC> List<S> saveAllAndFlush(Iterable<S> entities) {
        return semesterGCRepository.saveAllAndFlush(entities);
    }

    @Deprecated
    public void deleteInBatch(Iterable<SemesterGC> entities) {
        semesterGCRepository.deleteInBatch(entities);
    }

    public void deleteAllInBatch(Iterable<SemesterGC> entities) {
        semesterGCRepository.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        semesterGCRepository.deleteAllByIdInBatch(integers);
    }

    public void deleteAllInBatch() {
        semesterGCRepository.deleteAllInBatch();
    }

    @Deprecated
    public SemesterGC getOne(Integer integer) {
        return semesterGCRepository.getOne(integer);
    }

    public SemesterGC getById(Integer integer) {
        return semesterGCRepository.getById(integer);
    }

    public <S extends SemesterGC> List<S> findAll(Example<S> example) {
        return semesterGCRepository.findAll(example);
    }

    public <S extends SemesterGC> List<S> findAll(Example<S> example, Sort sort) {
        return semesterGCRepository.findAll(example, sort);
    }

    public Page<SemesterGC> findAll(Pageable pageable) {
        return semesterGCRepository.findAll(pageable);
    }

    public <S extends SemesterGC> S save(S entity) {
        return semesterGCRepository.save(entity);
    }

    public Optional<SemesterGC> findById(Integer integer) {
        return semesterGCRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return semesterGCRepository.existsById(integer);
    }

    public long count() {
        return semesterGCRepository.count();
    }

    public void deleteById(Integer integer) {
        semesterGCRepository.deleteById(integer);
    }

    public void delete(SemesterGC entity) {
        semesterGCRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        semesterGCRepository.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends SemesterGC> entities) {
        semesterGCRepository.deleteAll(entities);
    }

    public void deleteAll() {
        semesterGCRepository.deleteAll();
    }

    public <S extends SemesterGC> Optional<S> findOne(Example<S> example) {
        return semesterGCRepository.findOne(example);
    }

    public <S extends SemesterGC> Page<S> findAll(Example<S> example, Pageable pageable) {
        return semesterGCRepository.findAll(example, pageable);
    }

    public <S extends SemesterGC> long count(Example<S> example) {
        return semesterGCRepository.count(example);
    }

    public <S extends SemesterGC> boolean exists(Example<S> example) {
        return semesterGCRepository.exists(example);
    }
}
