package com.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.models.Mdl_department;

public interface Repo_department extends JpaRepository<Mdl_department, Long> {}
