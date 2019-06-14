package com.hackley.mydomain.firstWebApp.Controller;

import com.hackley.mydomain.firstWebApp.Model.Album;
import com.hackley.mydomain.firstWebApp.Model.Song;
import com.hackley.mydomain.firstWebApp.Repository.AlbumRepository;
import com.hackley.mydomain.firstWebApp.Repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Collections;
import java.util.List;

@Controller
public class AlbumController {
    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    SongRepository songRepository;

    @GetMapping("/albums")
    public String getAllAlbums(Model model){
        Iterable<Album> albums = albumRepository.findAll();
        model.addAttribute("albums", albums);
        return "allAlbums";
    }

    @GetMapping("/form")
    public String albumForm(Model model){
        model.addAttribute("album", new Album());
        return "form";
    }
    @PostMapping("/form")
    public String albumSubmit(@ModelAttribute Album album) {
        albumRepository.save(album);
        return "redirect:/albums";
    }

    @GetMapping("/album/{id}")
    public String albumDetail(@PathVariable long id, Model model){
        List<Song> songs = songRepository.findByAlbumId(id);
        Album album = albumRepository.findById(id).get();
        model.addAttribute("album", album);
        model.addAttribute("songs", songs);
        return "albumDetail";
    }



}
