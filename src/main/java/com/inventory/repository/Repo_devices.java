package com.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.models.Mdl_devices;

public interface Repo_devices extends JpaRepository<Mdl_devices, Long> {}
