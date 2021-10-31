package com.example.kanban.repositories;

import com.example.kanban.entities.ChangeLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChangeLogRepository extends JpaRepository<ChangeLog,Long> {
}
