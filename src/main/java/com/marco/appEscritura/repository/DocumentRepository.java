package com.marco.appEscritura.repository;

import com.marco.appEscritura.entity.Document;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DocumentRepository extends CrudRepository<Document, Long> {
    @Query("SELECT d FROM Document d WHERE d.creator.username = ?1")
    Optional<List<Document>> findByCreatorUsername(String username);

}
