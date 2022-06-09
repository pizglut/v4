package com.example.v4.item.repository;

import com.example.v4.item.domain.Tytul;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TytulRepository extends JpaRepository<Tytul, Long> {
}
