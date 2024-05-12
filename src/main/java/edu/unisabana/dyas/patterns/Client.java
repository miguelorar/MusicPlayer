package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayer;
import edu.unisabana.dyas.patterns.utils.AudioPlayerAdapter;

// Cliente que utiliza directamente AdvancedAudioPlayer sin conocer la interfaz AudioPlayer
public class Client {
    public static void main(String[] args) {
        AdvancedAudioPlayer advancedPlayer = new AdvancedAudioPlayer();
        AudioPlayerAdapter adapter = new AudioPlayerAdapter(advancedPlayer);

        adapter.play("mp4", "video.mp4");
        adapter.stop();
    }
}