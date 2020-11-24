package com.example.codeclan.OneToManyHomeworkFoldersFilesUsers.components;

import com.example.codeclan.OneToManyHomeworkFoldersFilesUsers.models.User;
import com.example.codeclan.OneToManyHomeworkFoldersFilesUsers.models.File;
import com.example.codeclan.OneToManyHomeworkFoldersFilesUsers.models.Folder;
import com.example.codeclan.OneToManyHomeworkFoldersFilesUsers.repositories.FileRepository;
import com.example.codeclan.OneToManyHomeworkFoldersFilesUsers.repositories.FolderRepository;
import com.example.codeclan.OneToManyHomeworkFoldersFilesUsers.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args){
        User John = new User("John");
        userRepository.save(John);
        User Sue = new User("Sue");
        userRepository.save(Sue);
        User Mary = new User("Mary");
        userRepository.save(Mary);

        Folder folder1 = new Folder("week_01", John);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("week_02", John);
        folderRepository.save(folder2);
        Folder folder3 = new Folder("week_03", Mary);
        folderRepository.save(folder3);

        File file1 = new File("day_01", ".txt", 10, folder1);
        fileRepository.save(file1);
        File file2 = new File("day_02", ".txt", 50, folder1);
        fileRepository.save(file1);
        File file3 = new File("day_03", ".txt", 90, folder3);
        fileRepository.save(file1);


        John.addFolder(folder1);
        John.addFolder(folder2);
        Mary.addFolder(folder3);

        folder1.addFile(file1);
        folder1.addFile(file2);
        folder2.addFile(file3);



    }

}
