package UniBoard.service;

import UniBoard.entity.users.Person;
import UniBoard.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public List<Person> findAll(Sort sort) {
        return personRepository.findAll(sort);
    }

    public List<Person> findAllById(Iterable<Integer> integers) {
        return personRepository.findAllById(integers);
    }

    public <S extends Person> List<S> saveAll(Iterable<S> entities) {
        return personRepository.saveAll(entities);
    }

    public void flush() {
        personRepository.flush();
    }

    public <S extends Person> S saveAndFlush(S entity) {
        return personRepository.saveAndFlush(entity);
    }

    public <S extends Person> List<S> saveAllAndFlush(Iterable<S> entities) {
        return personRepository.saveAllAndFlush(entities);
    }

    @Deprecated
    public void deleteInBatch(Iterable<Person> entities) {
        personRepository.deleteInBatch(entities);
    }

    public void deleteAllInBatch(Iterable<Person> entities) {
        personRepository.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        personRepository.deleteAllByIdInBatch(integers);
    }

    public void deleteAllInBatch() {
        personRepository.deleteAllInBatch();
    }

    @Deprecated
    public Person getOne(Integer integer) {
        return personRepository.getOne(integer);
    }

    public Person getById(Integer integer) {
        return personRepository.getById(integer);
    }

    public <S extends Person> List<S> findAll(Example<S> example) {
        return personRepository.findAll(example);
    }

    public <S extends Person> List<S> findAll(Example<S> example, Sort sort) {
        return personRepository.findAll(example, sort);
    }

    public Page<Person> findAll(Pageable pageable) {
        return personRepository.findAll(pageable);
    }

    public <S extends Person> S save(S entity) {
        return personRepository.save(entity);
    }

    public Optional<Person> findById(Integer integer) {
        return personRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return personRepository.existsById(integer);
    }

    public long count() {
        return personRepository.count();
    }

    public void deleteById(Integer integer) {
        personRepository.deleteById(integer);
    }

    public void delete(Person entity) {
        personRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        personRepository.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends Person> entities) {
        personRepository.deleteAll(entities);
    }

    public void deleteAll() {
        personRepository.deleteAll();
    }

    public <S extends Person> Optional<S> findOne(Example<S> example) {
        return personRepository.findOne(example);
    }

    public <S extends Person> Page<S> findAll(Example<S> example, Pageable pageable) {
        return personRepository.findAll(example, pageable);
    }

    public <S extends Person> long count(Example<S> example) {
        return personRepository.count(example);
    }

    public <S extends Person> boolean exists(Example<S> example) {
        return personRepository.exists(example);
    }
}
