package UniBoard.service;

import UniBoard.entity.users.Student;
import UniBoard.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public List<Student> findAll(Sort sort) {
        return studentRepository.findAll(sort);
    }

    public List<Student> findAllById(Iterable<Integer> integers) {
        return studentRepository.findAllById(integers);
    }

    public <S extends Student> List<S> saveAll(Iterable<S> entities) {
        return studentRepository.saveAll(entities);
    }

    public void flush() {
        studentRepository.flush();
    }

    public <S extends Student> S saveAndFlush(S entity) {
        return studentRepository.saveAndFlush(entity);
    }

    public <S extends Student> List<S> saveAllAndFlush(Iterable<S> entities) {
        return studentRepository.saveAllAndFlush(entities);
    }

    @Deprecated
    public void deleteInBatch(Iterable<Student> entities) {
        studentRepository.deleteInBatch(entities);
    }

    public void deleteAllInBatch(Iterable<Student> entities) {
        studentRepository.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        studentRepository.deleteAllByIdInBatch(integers);
    }

    public void deleteAllInBatch() {
        studentRepository.deleteAllInBatch();
    }

    @Deprecated
    public Student getOne(Integer integer) {
        return studentRepository.getOne(integer);
    }

    public Student getById(Integer integer) {
        return studentRepository.getById(integer);
    }

    public <S extends Student> List<S> findAll(Example<S> example) {
        return studentRepository.findAll(example);
    }

    public <S extends Student> List<S> findAll(Example<S> example, Sort sort) {
        return studentRepository.findAll(example, sort);
    }

    public Page<Student> findAll(Pageable pageable) {
        return studentRepository.findAll(pageable);
    }

    public <S extends Student> S save(S entity) {
        return studentRepository.save(entity);
    }

    public Optional<Student> findById(Integer integer) {
        return studentRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return studentRepository.existsById(integer);
    }

    public long count() {
        return studentRepository.count();
    }

    public void deleteById(Integer integer) {
        studentRepository.deleteById(integer);
    }

    public void delete(Student entity) {
        studentRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        studentRepository.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends Student> entities) {
        studentRepository.deleteAll(entities);
    }

    public void deleteAll() {
        studentRepository.deleteAll();
    }

    public <S extends Student> Optional<S> findOne(Example<S> example) {
        return studentRepository.findOne(example);
    }

    public <S extends Student> Page<S> findAll(Example<S> example, Pageable pageable) {
        return studentRepository.findAll(example, pageable);
    }

    public <S extends Student> long count(Example<S> example) {
        return studentRepository.count(example);
    }

    public <S extends Student> boolean exists(Example<S> example) {
        return studentRepository.exists(example);
    }
}
