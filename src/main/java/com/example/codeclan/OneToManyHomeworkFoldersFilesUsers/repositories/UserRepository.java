package com.example.codeclan.OneToManyHomeworkFoldersFilesUsers.repositories;

import com.example.codeclan.OneToManyHomeworkFoldersFilesUsers.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
