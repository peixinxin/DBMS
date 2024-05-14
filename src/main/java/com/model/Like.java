package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "like")
public class Like {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long likeId;

    @Column(name = "Event_ID", nullable = false)
    private Long eventId;

    @Column(name = "Volunteer_ID", nullable = false)
    private Long volunteerId;

    @Column(name = "List_of_likes", nullable = false)
    private int listOfLikes;

    // Constructors
    public Like() {
    }

    public Like(Long likeId, Long eventId, Long volunteerId, int listOfLikes) {
        this.likeId = likeId;
        this.eventId = eventId;
        this.volunteerId = volunteerId;
        this.listOfLikes = listOfLikes;
    }

    // Getters and Setters
    public Long getLikeId() {
        return likeId;
    }

    public void setLikeId(Long likeId) {
        this.likeId = likeId;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Long getVolunteerId() {
        return volunteerId;
    }

    public void setVolunteerId(Long volunteerId) {
        this.volunteerId = volunteerId;
    }

    public int getListOfLikes() {
        return listOfLikes;
    }

    public void setListOfLikes(int listOfLikes) {
        this.listOfLikes = listOfLikes;
    }
}
