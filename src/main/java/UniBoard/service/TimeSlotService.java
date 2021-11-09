package UniBoard.service;

import UniBoard.entity.domaindata.TimeSlot;
import UniBoard.repository.TimeSlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TimeSlotService {
    @Autowired
    private TimeSlotRepository timeSlotRepository;

    public List<TimeSlot> findAll() {
        return timeSlotRepository.findAll();
    }

    public List<TimeSlot> findAll(Sort sort) {
        return timeSlotRepository.findAll(sort);
    }

    public List<TimeSlot> findAllById(Iterable<Integer> integers) {
        return timeSlotRepository.findAllById(integers);
    }

    public <S extends TimeSlot> List<S> saveAll(Iterable<S> entities) {
        return timeSlotRepository.saveAll(entities);
    }

    public void flush() {
        timeSlotRepository.flush();
    }

    public <S extends TimeSlot> S saveAndFlush(S entity) {
        return timeSlotRepository.saveAndFlush(entity);
    }

    public <S extends TimeSlot> List<S> saveAllAndFlush(Iterable<S> entities) {
        return timeSlotRepository.saveAllAndFlush(entities);
    }

    @Deprecated
    public void deleteInBatch(Iterable<TimeSlot> entities) {
        timeSlotRepository.deleteInBatch(entities);
    }

    public void deleteAllInBatch(Iterable<TimeSlot> entities) {
        timeSlotRepository.deleteAllInBatch(entities);
    }

    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        timeSlotRepository.deleteAllByIdInBatch(integers);
    }

    public void deleteAllInBatch() {
        timeSlotRepository.deleteAllInBatch();
    }

    @Deprecated
    public TimeSlot getOne(Integer integer) {
        return timeSlotRepository.getOne(integer);
    }

    public TimeSlot getById(Integer integer) {
        return timeSlotRepository.getById(integer);
    }

    public <S extends TimeSlot> List<S> findAll(Example<S> example) {
        return timeSlotRepository.findAll(example);
    }

    public <S extends TimeSlot> List<S> findAll(Example<S> example, Sort sort) {
        return timeSlotRepository.findAll(example, sort);
    }

    public Page<TimeSlot> findAll(Pageable pageable) {
        return timeSlotRepository.findAll(pageable);
    }

    public <S extends TimeSlot> S save(S entity) {
        return timeSlotRepository.save(entity);
    }

    public Optional<TimeSlot> findById(Integer integer) {
        return timeSlotRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return timeSlotRepository.existsById(integer);
    }

    public long count() {
        return timeSlotRepository.count();
    }

    public void deleteById(Integer integer) {
        timeSlotRepository.deleteById(integer);
    }

    public void delete(TimeSlot entity) {
        timeSlotRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Integer> integers) {
        timeSlotRepository.deleteAllById(integers);
    }

    public void deleteAll(Iterable<? extends TimeSlot> entities) {
        timeSlotRepository.deleteAll(entities);
    }

    public void deleteAll() {
        timeSlotRepository.deleteAll();
    }

    public <S extends TimeSlot> Optional<S> findOne(Example<S> example) {
        return timeSlotRepository.findOne(example);
    }

    public <S extends TimeSlot> Page<S> findAll(Example<S> example, Pageable pageable) {
        return timeSlotRepository.findAll(example, pageable);
    }

    public <S extends TimeSlot> long count(Example<S> example) {
        return timeSlotRepository.count(example);
    }

    public <S extends TimeSlot> boolean exists(Example<S> example) {
        return timeSlotRepository.exists(example);
    }
}
