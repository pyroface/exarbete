package com.examensarbete.userwatchlist.movie;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.examensarbete.userwatchlist.watchlist.Watchlist;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String name;
    private boolean watched;
    private String rating;

    @JsonIgnore
    @ManyToMany(mappedBy = "moviesToWatch")
    private Set<Watchlist> watchlists = new HashSet<>();

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean isWatched() {
        return watched;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }

    public Set<Watchlist> getWatchlists() {
        return watchlists;
    }

}
