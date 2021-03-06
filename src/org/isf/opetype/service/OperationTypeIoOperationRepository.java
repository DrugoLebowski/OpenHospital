package org.isf.opetype.service;

import java.util.List;

import org.isf.opetype.model.OperationType;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OperationTypeIoOperationRepository extends JpaRepository<OperationType, String> {
    public List<OperationType> findAllByOrderByDescriptionAsc();
}