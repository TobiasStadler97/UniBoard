package UniBoard.service;

import UniBoard.entity.domaindata.Course;
import UniBoard.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    public List<Course> findAll(Sort sort) {
        return courseRepository.findAll(sort);
    }

    public List<Course> findAllById(Iterable<Integer> integers) {
        return courseRepository.findAllById(integers);
    }

    public <S extends Course> List<S> saveAll(Iterable<S> entities) {
        return courseRepository.saveAll(entities);
    }

    public void flush() {
        courseRepository.flush();
    }

    public <S extends Course> S saveAndFlush(S entity) {
        return courseRepository.saveAndFlush(entity);
    }

    public <S extends Course> List<S> saveAllAndFlush(Iterable<S> entities) {
        return courseRepository.saveAllAndFlush(entities);
    }

    @Deprecated
    public void deleteInBatch(Iterable<Course> entities) {
        courseRepository.deleteInBatch(entities);
    }

    public void deleteAllInBatch(Iterable<Course> entities) {
        courseRepository.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        courseRepository.deleteAllByIdInBatch(integers);
    }

    public void deleteAllInBatch() {
        courseRepository.deleteAllInBatch();
    }

    @Deprecated
    public Course getOne(Integer integer) {
        return courseRepository.getOne(integer);
    }

    public Course getById(Integer integer) {
        return courseRepository.getById(integer);
    }

    public <S extends Course> List<S> findAll(Example<S> example) {
        return courseRepository.findAll(example);
    }

    public <S extends Course> List<S> findAll(Example<S> example, Sort sort) {
        return courseRepository.findAll(example, sort);
    }

    public Page<Course> findAll(Pageable pageable) {
        return courseRepository.findAll(pageable);
    }

    public <S extends Course> S save(S entity) {
        return courseRepository.save(entity);
    }

    public Optional<Course> findById(Integer integer) {
        return courseRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return courseRepository.existsById(integer);
    }

    public long count() {
        return courseRepository.count();
    }

    public void deleteById(Integer integer) {
        courseRepository.deleteById(integer);
    }

    public void delete(Course entity) {
        courseRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        courseRepository.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends Course> entities) {
        courseRepository.deleteAll(entities);
    }

    public void deleteAll() {
        courseRepository.deleteAll();
    }

    public <S extends Course> Optional<S> findOne(Example<S> example) {
        return courseRepository.findOne(example);
    }

    public <S extends Course> Page<S> findAll(Example<S> example, Pageable pageable) {
        return courseRepository.findAll(example, pageable);
    }

    public <S extends Course> long count(Example<S> example) {
        return courseRepository.count(example);
    }

    public <S extends Course> boolean exists(Example<S> example) {
        return courseRepository.exists(example);
    }
}
