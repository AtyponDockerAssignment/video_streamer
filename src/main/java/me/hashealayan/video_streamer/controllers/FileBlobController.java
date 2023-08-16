package me.hashealayan.video_streamer.controllers;

import lombok.AllArgsConstructor;
import me.hashealayan.video_streamer.domain.FileBlob;
import me.hashealayan.video_streamer.repositories.FileBlobRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class FileBlobController {

    private FileBlobRepository blobRepository;

    @GetMapping("/blobs")
    public ResponseEntity<List<FileBlob>> getAllBlobs() {
        return ResponseEntity.ok(blobRepository.findAll());
    }
}
