package com.examensarbete.userwatchlist.watchlist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchlistRepository extends JpaRepository<Watchlist, Long> {}
