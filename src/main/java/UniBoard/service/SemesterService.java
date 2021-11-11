package UniBoard.service;

import UniBoard.entity.domaindata.Semester;
import UniBoard.repository.SemesterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SemesterService {
    @Autowired
    private SemesterRepository semesterRepository;

    public List<Semester> findAll() {
        return semesterRepository.findAll();
    }

    public List<Semester> findAll(Sort sort) {
        return semesterRepository.findAll(sort);
    }

    public List<Semester> findAllById(Iterable<Integer> integers) {
        return semesterRepository.findAllById(integers);
    }

    public <S extends Semester> List<S> saveAll(Iterable<S> entities) {
        return semesterRepository.saveAll(entities);
    }

    public void flush() {
        semesterRepository.flush();
    }

    public <S extends Semester> S saveAndFlush(S entity) {
        return semesterRepository.saveAndFlush(entity);
    }

    public <S extends Semester> List<S> saveAllAndFlush(Iterable<S> entities) {
        return semesterRepository.saveAllAndFlush(entities);
    }

    @Deprecated
    public void deleteInBatch(Iterable<Semester> entities) {
        semesterRepository.deleteInBatch(entities);
    }

    public void deleteAllInBatch(Iterable<Semester> entities) {
        semesterRepository.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        semesterRepository.deleteAllByIdInBatch(integers);
    }

    public void deleteAllInBatch() {
        semesterRepository.deleteAllInBatch();
    }

    @Deprecated
    public Semester getOne(Integer integer) {
        return semesterRepository.getOne(integer);
    }

    public Semester getById(Integer integer) {
        return semesterRepository.getById(integer);
    }

    public <S extends Semester> List<S> findAll(Example<S> example) {
        return semesterRepository.findAll(example);
    }

    public <S extends Semester> List<S> findAll(Example<S> example, Sort sort) {
        return semesterRepository.findAll(example, sort);
    }

    public Page<Semester> findAll(Pageable pageable) {
        return semesterRepository.findAll(pageable);
    }

    public <S extends Semester> S save(S entity) {
        return semesterRepository.save(entity);
    }

    public Optional<Semester> findById(Integer integer) {
        return semesterRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return semesterRepository.existsById(integer);
    }

    public long count() {
        return semesterRepository.count();
    }

    public void deleteById(Integer integer) {
        semesterRepository.deleteById(integer);
    }

    public void delete(Semester entity) {
        semesterRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        semesterRepository.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends Semester> entities) {
        semesterRepository.deleteAll(entities);
    }

    public void deleteAll() {
        semesterRepository.deleteAll();
    }

    public <S extends Semester> Optional<S> findOne(Example<S> example) {
        return semesterRepository.findOne(example);
    }

    public <S extends Semester> Page<S> findAll(Example<S> example, Pageable pageable) {
        return semesterRepository.findAll(example, pageable);
    }

    public <S extends Semester> long count(Example<S> example) {
        return semesterRepository.count(example);
    }

    public <S extends Semester> boolean exists(Example<S> example) {
        return semesterRepository.exists(example);
    }
}
