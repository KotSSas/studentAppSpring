package com.example.studentappspring;

 import com.example.studentappspring.entity.Student;
 import com.example.studentappspring.repository.StudentRepository;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentAppSpringApplication  implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(StudentAppSpringApplication.class, args);
    }
   @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student student1 = new Student("Alex","aa","aaa");
        studentRepository.save(student1);

        Student student2 = new Student("Peter","Parker","aaa");
        studentRepository.save(student2);
    }
}
