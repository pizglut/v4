package com.example.v4.item.repository;

import com.example.v4.item.domain.DataArtykulu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataArtykuluRepository extends JpaRepository<DataArtykulu, Long> {
}
