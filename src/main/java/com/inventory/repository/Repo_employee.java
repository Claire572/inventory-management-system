package com.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.models.Mdl_employee;

public interface Repo_employee extends JpaRepository<Mdl_employee, Long> {}
