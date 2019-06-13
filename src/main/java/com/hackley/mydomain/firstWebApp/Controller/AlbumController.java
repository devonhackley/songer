package com.hackley.mydomain.firstWebApp.Controller;

import com.hackley.mydomain.firstWebApp.Model.Album;
import com.hackley.mydomain.firstWebApp.Repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class AlbumController {
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String getAllAlbums(Model model){
        Iterable<Album> albums = albumRepository.findAll();
        model.addAttribute("albums", albums);
        return "allAlbums";
    }

    @GetMapping("/form")
    public String albumForm(Model model){
        model.addAttribute("album", new Album());
        return "album_form";
    }
    @PostMapping("/form")
    public String albumSubmit(@ModelAttribute Album album) {
        albumRepository.save(album);
        return "redirect:/albums";
    }

}
