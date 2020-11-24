package com.example.codeclan.OneToManyHomeworkFoldersFilesUsers.repositories;

import com.example.codeclan.OneToManyHomeworkFoldersFilesUsers.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
