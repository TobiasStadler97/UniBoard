package UniBoard.service;

import UniBoard.entity.domaindata.Discussion;
import UniBoard.repository.DiscussionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiscussionService {
    @Autowired
    private DiscussionRepository discussionRepository;

    public List<Discussion> getDiscussionsByCourseID(int course_id){
        return discussionRepository.getDiscussionsByCourseId(course_id);
    }

    public List<Discussion> findAll() {
        return discussionRepository.findAll();
    }

    public List<Discussion> findAll(Sort sort) {
        return discussionRepository.findAll(sort);
    }

    public List<Discussion> findAllById(Iterable<Integer> integers) {
        return discussionRepository.findAllById(integers);
    }

    public <S extends Discussion> List<S> saveAll(Iterable<S> entities) {
        return discussionRepository.saveAll(entities);
    }

    public void flush() {
        discussionRepository.flush();
    }

    public <S extends Discussion> S saveAndFlush(S entity) {
        return discussionRepository.saveAndFlush(entity);
    }

    public <S extends Discussion> List<S> saveAllAndFlush(Iterable<S> entities) {
        return discussionRepository.saveAllAndFlush(entities);
    }

    @Deprecated
    public void deleteInBatch(Iterable<Discussion> entities) {
        discussionRepository.deleteInBatch(entities);
    }

    public void deleteAllInBatch(Iterable<Discussion> entities) {
        discussionRepository.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        discussionRepository.deleteAllByIdInBatch(integers);
    }

    public void deleteAllInBatch() {
        discussionRepository.deleteAllInBatch();
    }

    @Deprecated
    public Discussion getOne(Integer integer) {
        return discussionRepository.getOne(integer);
    }

    public Discussion getById(Integer integer) {
        return discussionRepository.getById(integer);
    }

    public <S extends Discussion> List<S> findAll(Example<S> example) {
        return discussionRepository.findAll(example);
    }

    public <S extends Discussion> List<S> findAll(Example<S> example, Sort sort) {
        return discussionRepository.findAll(example, sort);
    }

    public Page<Discussion> findAll(Pageable pageable) {
        return discussionRepository.findAll(pageable);
    }

    public <S extends Discussion> S save(S entity) {
        return discussionRepository.save(entity);
    }

    public Optional<Discussion> findById(Integer integer) {
        return discussionRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return discussionRepository.existsById(integer);
    }

    public long count() {
        return discussionRepository.count();
    }

    public void deleteById(Integer integer) {
        discussionRepository.deleteById(integer);
    }

    public void delete(Discussion entity) {
        discussionRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        discussionRepository.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends Discussion> entities) {
        discussionRepository.deleteAll(entities);
    }

    public void deleteAll() {
        discussionRepository.deleteAll();
    }

    public <S extends Discussion> Optional<S> findOne(Example<S> example) {
        return discussionRepository.findOne(example);
    }

    public <S extends Discussion> Page<S> findAll(Example<S> example, Pageable pageable) {
        return discussionRepository.findAll(example, pageable);
    }

    public <S extends Discussion> long count(Example<S> example) {
        return discussionRepository.count(example);
    }

    public <S extends Discussion> boolean exists(Example<S> example) {
        return discussionRepository.exists(example);
    }
}
