package com.example.v4.item.repository;

import com.example.v4.item.domain.Imie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImieRepository extends JpaRepository<Imie, Long> {
}
