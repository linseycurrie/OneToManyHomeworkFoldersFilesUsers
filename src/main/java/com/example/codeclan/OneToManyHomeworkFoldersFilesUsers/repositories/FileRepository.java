package com.example.codeclan.OneToManyHomeworkFoldersFilesUsers.repositories;

import com.example.codeclan.OneToManyHomeworkFoldersFilesUsers.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
