package com.example.v4.item.repository;

import com.example.v4.item.domain.Godzina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GodzinaRepository extends JpaRepository<Godzina, Long> {
}
