package UniBoard.service;

import UniBoard.entity.domaindata.TextField;
import UniBoard.repository.TextFieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TextFieldService {
    @Autowired
    private TextFieldRepository textFieldRepository;

    public List<TextField> findAll() {
        return textFieldRepository.findAll();
    }

    public List<TextField> findAll(Sort sort) {
        return textFieldRepository.findAll(sort);
    }

    public List<TextField> findAllById(Iterable<Integer> integers) {
        return textFieldRepository.findAllById(integers);
    }

    public <S extends TextField> List<S> saveAll(Iterable<S> entities) {
        return textFieldRepository.saveAll(entities);
    }

    public void flush() {
        textFieldRepository.flush();
    }

    public <S extends TextField> S saveAndFlush(S entity) {
        return textFieldRepository.saveAndFlush(entity);
    }

    public <S extends TextField> List<S> saveAllAndFlush(Iterable<S> entities) {
        return textFieldRepository.saveAllAndFlush(entities);
    }

    @Deprecated
    public void deleteInBatch(Iterable<TextField> entities) {
        textFieldRepository.deleteInBatch(entities);
    }

    public void deleteAllInBatch(Iterable<TextField> entities) {
        textFieldRepository.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        textFieldRepository.deleteAllByIdInBatch(integers);
    }

    public void deleteAllInBatch() {
        textFieldRepository.deleteAllInBatch();
    }

    @Deprecated
    public TextField getOne(Integer integer) {
        return textFieldRepository.getOne(integer);
    }

    public TextField getById(Integer integer) {
        return textFieldRepository.getById(integer);
    }

    public <S extends TextField> List<S> findAll(Example<S> example) {
        return textFieldRepository.findAll(example);
    }

    public <S extends TextField> List<S> findAll(Example<S> example, Sort sort) {
        return textFieldRepository.findAll(example, sort);
    }

    public Page<TextField> findAll(Pageable pageable) {
        return textFieldRepository.findAll(pageable);
    }

    public <S extends TextField> S save(S entity) {
        return textFieldRepository.save(entity);
    }

    public Optional<TextField> findById(Integer integer) {
        return textFieldRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return textFieldRepository.existsById(integer);
    }

    public long count() {
        return textFieldRepository.count();
    }

    public void deleteById(Integer integer) {
        textFieldRepository.deleteById(integer);
    }

    public void delete(TextField entity) {
        textFieldRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        textFieldRepository.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends TextField> entities) {
        textFieldRepository.deleteAll(entities);
    }

    public void deleteAll() {
        textFieldRepository.deleteAll();
    }

    public <S extends TextField> Optional<S> findOne(Example<S> example) {
        return textFieldRepository.findOne(example);
    }

    public <S extends TextField> Page<S> findAll(Example<S> example, Pageable pageable) {
        return textFieldRepository.findAll(example, pageable);
    }

    public <S extends TextField> long count(Example<S> example) {
        return textFieldRepository.count(example);
    }

    public <S extends TextField> boolean exists(Example<S> example) {
        return textFieldRepository.exists(example);
    }
}
