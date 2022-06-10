package com.examensarbete.userwatchlist.watchlist;

import com.examensarbete.userwatchlist.movie.movie;
import com.examensarbete.userwatchlist.movie.MovieRepository;
import com.examensarbete.userwatchlist.user.User;
import com.examensarbete.userwatchlist.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/watchlists")
public class WatchlistController {

    @Autowired
    WatchlistRepository watchlistRepository;

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    UserRepository userRepository;

    @GetMapping
    List<Watchlist> getWatchlists() {
        return watchlistRepository.findAll();
    }

    @PostMapping
    Watchlist createWatchlist(@RequestBody Watchlist watchlist) {
        return watchlistRepository.save(watchlist);
    }

    @PutMapping("/{watchlistId}/movies/{movieId}")
    Watchlist addMovieToWatchlist(
            @PathVariable Long watchlistId,
            @PathVariable Long movieId
    ) {
        Watchlist watchlist = watchlistRepository.findById(watchlistId).get();
        movie movie = movieRepository.findById(movieId).get();
        watchlist.moviesToWatch.add(movie);
        return watchlistRepository.save(watchlist);
    }

    @PutMapping("/{watchlistId}/users/{userId}")
    Watchlist assignUserToWatchlist(
            @PathVariable Long watchlistId,
            @PathVariable Long userId
    ) {
        Watchlist watchlist = watchlistRepository.findById(watchlistId).get();
        User user = userRepository.findById(userId).get();
        watchlist.setUser(user);
        return watchlistRepository.save(watchlist);
    }
}
