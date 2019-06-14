package com.hackley.mydomain.firstWebApp.Repository;

import com.hackley.mydomain.firstWebApp.Model.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album, Long> {
    public Album findByTitle(String title);
}
