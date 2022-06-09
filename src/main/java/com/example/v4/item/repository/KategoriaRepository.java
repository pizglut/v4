package com.example.v4.item.repository;

import com.example.v4.item.domain.Kategoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KategoriaRepository extends JpaRepository<Kategoria, Long> {
}
