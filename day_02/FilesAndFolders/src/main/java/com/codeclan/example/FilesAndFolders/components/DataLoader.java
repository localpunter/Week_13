package com.codeclan.example.FilesAndFolders.components;

import com.codeclan.example.FilesAndFolders.models.File;
import com.codeclan.example.FilesAndFolders.models.Folder;
import com.codeclan.example.FilesAndFolders.models.User;
import com.codeclan.example.FilesAndFolders.repositories.FileRepository;
import com.codeclan.example.FilesAndFolders.repositories.FolderRepository;
import com.codeclan.example.FilesAndFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user1 = new User("Itchy");
        userRepository.save(user1);

        User user2 = new User("Alan");
        userRepository.save(user2);

        Folder personal = new Folder("Clinic Visits", user1);
        folderRepository.save(personal);

        Folder codeclan = new Folder("Java", user2);
        folderRepository.save(codeclan);

        File wartsAndBoils = new File("Warts and Boils", "doc", 23, personal);
        fileRepository.save(wartsAndBoils);

        File spring = new File("spring", "java", 45, codeclan);
        fileRepository.save(spring);

    }
}
