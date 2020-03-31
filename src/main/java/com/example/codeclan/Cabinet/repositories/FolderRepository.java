package com.example.codeclan.Cabinet.repositories;

import com.example.codeclan.Cabinet.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
