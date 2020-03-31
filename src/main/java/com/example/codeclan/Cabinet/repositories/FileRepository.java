package com.example.codeclan.Cabinet.repositories;
import com.example.codeclan.Cabinet.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository< File, Long> {
}
