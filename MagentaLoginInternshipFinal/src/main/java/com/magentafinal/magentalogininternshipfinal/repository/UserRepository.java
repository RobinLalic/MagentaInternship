package com.magentafinal.magentalogininternshipfinal.repository;

import com.magentafinal.magentalogininternshipfinal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT AVG(u.age) FROM User u JOIN u.readingPreferences b WHERE b.genre = :genre AND (b.id, u.id) IN (SELECT MIN(b2.id), u2.id FROM User u2 JOIN u2.readingPreferences b2 WHERE b2.genre = :genre GROUP BY u2.id)")
    Double findAverageAgeByBookGenre(@Param("genre") String genre);

    @Query("SELECT b.author, COUNT(b)*100.0/(SELECT COUNT(*) FROM User u JOIN u.readingPreferences b) FROM User u JOIN u.readingPreferences b GROUP BY b.author")
    List<Object[]> getReadingPreferencesByAuthor();
}
