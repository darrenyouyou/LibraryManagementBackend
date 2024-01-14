package com.example.librarymanagement.repository;

import com.example.librarymanagement.model.BorrowRecord;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public interface BorrowRecordRepository extends CrudRepository<BorrowRecord, Integer> {

    Iterable<BorrowRecord> findByUserId(int userId);
}
