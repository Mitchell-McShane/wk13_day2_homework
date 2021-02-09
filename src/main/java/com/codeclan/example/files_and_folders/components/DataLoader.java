package com.codeclan.example.files_and_folders.components;

import com.codeclan.example.files_and_folders.models.File;
import com.codeclan.example.files_and_folders.models.Folder;
import com.codeclan.example.files_and_folders.models.User;
import com.codeclan.example.files_and_folders.repositorys.FileRepository;
import com.codeclan.example.files_and_folders.repositorys.FolderRepository;
import com.codeclan.example.files_and_folders.repositorys.UserRepository;
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

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        User user1 = new User("Mitch");
        User user2 = new User("John");
        User user3 = new User("Paul");
        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);

        Folder folder1 = new Folder("Mitch's Folder", user1);
        Folder folder2 = new Folder("John's Folder", user2);
        Folder folder3 = new Folder("Paul's Folder", user3);
        folderRepository.save(folder1);
        folderRepository.save(folder2);
        folderRepository.save(folder3);

        File file1 = new File("Mitch's Homework", ".pdf", 5,folder1);
        File file2 = new File("John's Homework", ".txt", 4,folder2);
        File file3 = new File("Paul's Homework", ".docx", 8,folder3);

        fileRepository.save(file1);
        fileRepository.save(file2);
        fileRepository.save(file3);

    }
}
