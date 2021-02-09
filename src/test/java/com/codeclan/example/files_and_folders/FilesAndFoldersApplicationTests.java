package com.codeclan.example.files_and_folders;

import com.codeclan.example.files_and_folders.models.File;
import com.codeclan.example.files_and_folders.models.Folder;
import com.codeclan.example.files_and_folders.models.User;
import com.codeclan.example.files_and_folders.repositorys.FileRepository;
import com.codeclan.example.files_and_folders.repositorys.FolderRepository;
import com.codeclan.example.files_and_folders.repositorys.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FilesAndFoldersApplicationTests {

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
	public void canAddFilesFoldersAndUsers() {

		User user = new User("Mitch");
		userRepository.save(user);

		Folder folder = new Folder("Mitch's Folder", user);
		folderRepository.save(folder);

		File file = new File("Mitch's Homework", "pdf", 23, folder);
		fileRepository.save(file);
	}


}
