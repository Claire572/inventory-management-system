package com.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.models.Mdl_auditLog;

public interface Repo_auditLog extends JpaRepository<Mdl_auditLog, Long> {}
