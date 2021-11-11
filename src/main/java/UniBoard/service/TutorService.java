package UniBoard.service;

import UniBoard.entity.users.Tutor;
import UniBoard.repository.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TutorService {

    @Autowired
    private TutorRepository tutorRepository;

    public List<Tutor> findAll() {
        return tutorRepository.findAll();
    }

    public List<Tutor> findAll(Sort sort) {
        return tutorRepository.findAll(sort);
    }

    public List<Tutor> findAllById(Iterable<Integer> integers) {
        return tutorRepository.findAllById(integers);
    }

    public <S extends Tutor> List<S> saveAll(Iterable<S> entities) {
        return tutorRepository.saveAll(entities);
    }

    public void flush() {
        tutorRepository.flush();
    }

    public <S extends Tutor> S saveAndFlush(S entity) {
        return tutorRepository.saveAndFlush(entity);
    }

    public <S extends Tutor> List<S> saveAllAndFlush(Iterable<S> entities) {
        return tutorRepository.saveAllAndFlush(entities);
    }

    @Deprecated
    public void deleteInBatch(Iterable<Tutor> entities) {
        tutorRepository.deleteInBatch(entities);
    }

    public void deleteAllInBatch(Iterable<Tutor> entities) {
        tutorRepository.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        tutorRepository.deleteAllByIdInBatch(integers);
    }

    public void deleteAllInBatch() {
        tutorRepository.deleteAllInBatch();
    }

    @Deprecated
    public Tutor getOne(Integer integer) {
        return tutorRepository.getOne(integer);
    }

    public Tutor getById(Integer integer) {
        return tutorRepository.getById(integer);
    }

    public <S extends Tutor> List<S> findAll(Example<S> example) {
        return tutorRepository.findAll(example);
    }

    public <S extends Tutor> List<S> findAll(Example<S> example, Sort sort) {
        return tutorRepository.findAll(example, sort);
    }

    public Page<Tutor> findAll(Pageable pageable) {
        return tutorRepository.findAll(pageable);
    }

    public <S extends Tutor> S save(S entity) {
        return tutorRepository.save(entity);
    }

    public Optional<Tutor> findById(Integer integer) {
        return tutorRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return tutorRepository.existsById(integer);
    }

    public long count() {
        return tutorRepository.count();
    }

    public void deleteById(Integer integer) {
        tutorRepository.deleteById(integer);
    }

    public void delete(Tutor entity) {
        tutorRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        tutorRepository.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends Tutor> entities) {
        tutorRepository.deleteAll(entities);
    }

    public void deleteAll() {
        tutorRepository.deleteAll();
    }

    public <S extends Tutor> Optional<S> findOne(Example<S> example) {
        return tutorRepository.findOne(example);
    }

    public <S extends Tutor> Page<S> findAll(Example<S> example, Pageable pageable) {
        return tutorRepository.findAll(example, pageable);
    }

    public <S extends Tutor> long count(Example<S> example) {
        return tutorRepository.count(example);
    }

    public <S extends Tutor> boolean exists(Example<S> example) {
        return tutorRepository.exists(example);
    }
}
