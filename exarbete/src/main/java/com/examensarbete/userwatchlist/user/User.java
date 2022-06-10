package com.examensarbete.userwatchlist.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.examensarbete.userwatchlist.watchlist.Watchlist;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private Set<Watchlist> watchlists;

    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Watchlist> getWatchlists() {
        return this.watchlists;
    }

}
