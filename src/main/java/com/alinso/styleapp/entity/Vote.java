package com.alinso.styleapp.entity;

import javax.persistence.OneToOne;

public class Vote extends BaseEntity{

    @OneToOne
    private User user;

    @OneToOne
    private Photo photo;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }
}
