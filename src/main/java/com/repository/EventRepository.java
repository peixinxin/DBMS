package com.example.demo.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    // 可根據需要添加其他自定義的查詢方法

    List<Event> findAll();

    List<Event> findByNameContaining(String keyword);

}
