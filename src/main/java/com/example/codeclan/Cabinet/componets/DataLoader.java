package com.example.codeclan.Cabinet.componets;

import com.example.codeclan.Cabinet.models.File;
import com.example.codeclan.Cabinet.models.Folder;
import com.example.codeclan.Cabinet.models.User;
import com.example.codeclan.Cabinet.repositories.FileRepository;
import com.example.codeclan.Cabinet.repositories.FolderRepository;
import com.example.codeclan.Cabinet.repositories.UserRepository;
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
        User scully = new User("Scully");
        userRepository.save(scully);
        Folder ufo = new Folder("ufo", scully);
        folderRepository.save(ufo);
        File file1 =new File("X", "mp3", 12,ufo);
        fileRepository.save(file1);
    }
}
