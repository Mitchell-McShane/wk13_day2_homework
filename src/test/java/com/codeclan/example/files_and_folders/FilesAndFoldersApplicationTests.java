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
	public void createFilesUsersAndFolders(){
		User user1 = new User("Mitch");
		userRepository.save(user1);

		Folder folder1 = new Folder("User Folder", user1);
		folderRepository.save(folder1);

		File file1 = new File("Homework", ".txt", 5, folder1);
		fileRepository.save(file1);
	}

}
