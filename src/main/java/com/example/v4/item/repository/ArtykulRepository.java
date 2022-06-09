package com.example.v4.item.repository;

import com.example.v4.item.domain.Artykul;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtykulRepository extends JpaRepository<Artykul, Long> {
}
