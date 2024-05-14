package com.example.demo.service;

import com.example.demo.model.Event;
import com.example.demo.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    // 獲取所有事件
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    // 根據ID查找事件
    public Optional<Event> getEventById(Long id) {
        return eventRepository.findById(id);
    }

    // 創建新事件
    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    // 更新事件信息
    public Event updateEvent(Long id, Event eventDetails) {
        return eventRepository.findById(id)
                .map(event -> {
                    event.setName(eventDetails.getName());
                    event.setDescription(eventDetails.getDescription());
                    event.setLocation(eventDetails.getLocation());
                    event.setSupervise(eventDetails.getSupervise());
                    event.setStatus(eventDetails.getStatus());
                    event.setCategory(eventDetails.getCategory());
                    event.setStartDate(eventDetails.getStartDate());
                    event.setEndDate(eventDetails.getEndDate());
                    return eventRepository.save(event);
                })
                .orElseThrow(() -> new RuntimeException("Event not found with id " + id));
    }

    // 刪除事件
    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }
}
