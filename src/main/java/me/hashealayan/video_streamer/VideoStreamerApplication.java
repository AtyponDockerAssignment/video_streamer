package me.hashealayan.video_streamer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class VideoStreamerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoStreamerApplication.class, args);
	}

}
