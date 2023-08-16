package me.hashealayan.video_streamer.repositories;

import me.hashealayan.video_streamer.domain.FileBlob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileBlobRepository extends JpaRepository<FileBlob, Long> {
}
