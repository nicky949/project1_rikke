package org.rike.baitap1.repository;

import org.rike.baitap1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Eripository extends JpaRepository<Employee, Long>
{

    
} 