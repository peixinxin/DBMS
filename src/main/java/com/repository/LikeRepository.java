package com.example.demo.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Like;

@Repository
public interface LikeRepository extends JpaRepository<Like, Long> {
    // 查找某個活動的所有喜歡
    List<Like> findByEventId(Long eventId);

    // 查找某個志願者的所有喜歡
    List<Like> findByVolunteerId(Long volunteerId);

    // 查找某個活動的所有喜歡數
    int countByEventId(Long eventId);
}
