package com.example.codeclan.OneToManyHomeworkFoldersFilesUsers;

import com.example.codeclan.OneToManyHomeworkFoldersFilesUsers.models.File;
import com.example.codeclan.OneToManyHomeworkFoldersFilesUsers.models.Folder;
import com.example.codeclan.OneToManyHomeworkFoldersFilesUsers.models.User;
import com.example.codeclan.OneToManyHomeworkFoldersFilesUsers.repositories.FileRepository;
import com.example.codeclan.OneToManyHomeworkFoldersFilesUsers.repositories.FolderRepository;
import com.example.codeclan.OneToManyHomeworkFoldersFilesUsers.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OneToManyHomeworkFoldersFilesUsersApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createUserFolderAndFile(){
		User John = new User("John");
		userRepository.save(John);

		Folder folder1 = new Folder("week_01", John);
		folderRepository.save(folder1);

		File file1 = new File("day_01", ".txt", 20, folder1);
		fileRepository.save(file1);
	}

	@Test
	public void canAddFilesAndFolders(){
		User John = new User("John");
		userRepository.save(John);

		Folder folder1 = new Folder("week_01", John);
		folderRepository.save(folder1);

		File file1 = new File("day_01", ".txt", 20, folder1);
		fileRepository.save(file1);

		John.addFolder(folder1);
		userRepository.save(John);
	}

}
