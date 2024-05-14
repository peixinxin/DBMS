package com.example.demo.service;
import com.example.demo.model.Like;
import com.example.demo.repository.LikeRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class LikeService {

    private final LikeRepository likeRepository;

    public LikeService(LikeRepository likeRepository) {
        this.likeRepository = likeRepository;
    }

    // 獲取所有喜歡
    public List<Like> getAllLikes() {
        return likeRepository.findAll();
    }

    // 根據ID查找喜歡
    public Optional<Like> getLikeById(Long id) {
        return likeRepository.findById(id);
    }

    // 創建新的喜歡
    public Like createLike(Like like) {
        return likeRepository.save(like);
    }

    // 更新喜歡信息
    public Like updateLike(Long id, Like likeDetails) {
        return likeRepository.findById(id)
                .map(like -> {
                    like.setEventId(likeDetails.getEventId());
                    like.setVolunteerId(likeDetails.getVolunteerId());
                    like.setListOfLikes(likeDetails.getListOfLikes());
                    return likeRepository.save(like);
                })
                .orElseThrow(() -> new RuntimeException("Like not found with id " + id));
    }

    // 刪除喜歡
    public void deleteLike(Long id) {
        likeRepository.deleteById(id);
    }

    // 根據活動ID查找所有喜歡
    public List<Like> getLikesByEventId(Long eventId) {
        return likeRepository.findByEventId(eventId);
    }

    // 根據志願者ID查找所有喜歡
    public List<Like> getLikesByVolunteerId(Long volunteerId) {
        return likeRepository.findByVolunteerId(volunteerId);
    }

    // 根據活動ID計算喜歡的數量
    public int countLikesByEventId(Long eventId) {
        return likeRepository.countByEventId(eventId);
    }
}
