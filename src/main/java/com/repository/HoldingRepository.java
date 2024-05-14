package com.example.demo.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Holding;

@Repository
public interface HoldingRepository extends JpaRepository<Holding, Long> {
    List<Holding> findAll();

    // 根據組織ID查找持有事件
    List<Holding> findByOrganizationId(Long organizationId);

    // 根據事件ID查找持有事件
    List<Holding> findByEventId(Long eventId);

    // 根據狀態查找持有事件
    List<Holding> findByStatus(String status);
}
