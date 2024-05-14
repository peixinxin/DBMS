package com.example.demo.service;

import com.example.demo.model.Holding;
import com.example.demo.repository.HoldingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HoldingService {

    private final HoldingRepository holdingRepository;

    public HoldingService(HoldingRepository holdingRepository) {
        this.holdingRepository = holdingRepository;
    }

    // 獲取所有持有事件
    public List<Holding> getAllHoldings() {
        return holdingRepository.findAll();
    }

    // 根據ID查找持有事件
    public Optional<Holding> getHoldingById(Long id) {
        return holdingRepository.findById(id);
    }

    // 創建新的持有事件
    public Holding createHolding(Holding holding) {
        return holdingRepository.save(holding);
    }

    // 更新持有事件信息
    public Holding updateHolding(Long id, Holding holdingDetails) {
        return holdingRepository.findById(id)
                .map(holding -> {
                    holding.setOrganizationId(holdingDetails.getOrganizationId());
                    holding.setEventId(holdingDetails.getEventId());
                    holding.setStatus(holdingDetails.getStatus());
                    return holdingRepository.save(holding);
                })
                .orElseThrow(() -> new RuntimeException("Holding not found with id " + id));
    }

    // 刪除持有事件
    public void deleteHolding(Long id) {
        holdingRepository.deleteById(id);
    }
}
