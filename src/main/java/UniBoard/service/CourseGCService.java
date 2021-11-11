package UniBoard.service;

import UniBoard.entity.graphic.CourseGC;
import UniBoard.repository.CourseGCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseGCService {
    @Autowired
    private CourseGCRepository courseGCRepository;

    public List<CourseGC> findAll() {
        return courseGCRepository.findAll();
    }

    public List<CourseGC> findAll(Sort sort) {
        return courseGCRepository.findAll(sort);
    }

    public List<CourseGC> findAllById(Iterable<Integer> integers) {
        return courseGCRepository.findAllById(integers);
    }

    public <S extends CourseGC> List<S> saveAll(Iterable<S> entities) {
        return courseGCRepository.saveAll(entities);
    }

    public void flush() {
        courseGCRepository.flush();
    }

    public <S extends CourseGC> S saveAndFlush(S entity) {
        return courseGCRepository.saveAndFlush(entity);
    }

    public <S extends CourseGC> List<S> saveAllAndFlush(Iterable<S> entities) {
        return courseGCRepository.saveAllAndFlush(entities);
    }

    @Deprecated
    public void deleteInBatch(Iterable<CourseGC> entities) {
        courseGCRepository.deleteInBatch(entities);
    }

    public void deleteAllInBatch(Iterable<CourseGC> entities) {
        courseGCRepository.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        courseGCRepository.deleteAllByIdInBatch(integers);
    }

    public void deleteAllInBatch() {
        courseGCRepository.deleteAllInBatch();
    }

    @Deprecated
    public CourseGC getOne(Integer integer) {
        return courseGCRepository.getOne(integer);
    }

    public CourseGC getById(Integer integer) {
        return courseGCRepository.getById(integer);
    }

    public <S extends CourseGC> List<S> findAll(Example<S> example) {
        return courseGCRepository.findAll(example);
    }

    public <S extends CourseGC> List<S> findAll(Example<S> example, Sort sort) {
        return courseGCRepository.findAll(example, sort);
    }

    public Page<CourseGC> findAll(Pageable pageable) {
        return courseGCRepository.findAll(pageable);
    }

    public <S extends CourseGC> S save(S entity) {
        return courseGCRepository.save(entity);
    }

    public Optional<CourseGC> findById(Integer integer) {
        return courseGCRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return courseGCRepository.existsById(integer);
    }

    public long count() {
        return courseGCRepository.count();
    }

    public void deleteById(Integer integer) {
        courseGCRepository.deleteById(integer);
    }

    public void delete(CourseGC entity) {
        courseGCRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        courseGCRepository.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends CourseGC> entities) {
        courseGCRepository.deleteAll(entities);
    }

    public void deleteAll() {
        courseGCRepository.deleteAll();
    }

    public <S extends CourseGC> Optional<S> findOne(Example<S> example) {
        return courseGCRepository.findOne(example);
    }

    public <S extends CourseGC> Page<S> findAll(Example<S> example, Pageable pageable) {
        return courseGCRepository.findAll(example, pageable);
    }

    public <S extends CourseGC> long count(Example<S> example) {
        return courseGCRepository.count(example);
    }

    public <S extends CourseGC> boolean exists(Example<S> example) {
        return courseGCRepository.exists(example);
    }
}
