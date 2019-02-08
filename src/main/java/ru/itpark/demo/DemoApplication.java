package ru.itpark.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.itpark.demo.entity.NoticeEntity;
import ru.itpark.demo.repository.NoticeRepository;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(DemoApplication.class, args);

        var repository=context.getBean(NoticeRepository.class);

        repository.saveAll(List.of(
                new NoticeEntity(0,"Post", "First Basic", "Post@mail.ru",7899)));

    }

}

