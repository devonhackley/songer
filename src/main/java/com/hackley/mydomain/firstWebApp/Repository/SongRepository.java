package com.hackley.mydomain.firstWebApp.Repository;

import com.hackley.mydomain.firstWebApp.Model.Song;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SongRepository extends CrudRepository<Song, Long> {
    public List<Song> findByAlbumId(Long id);
}
