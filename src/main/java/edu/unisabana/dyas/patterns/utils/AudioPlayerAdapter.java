package edu.unisabana.dyas.patterns.utils;

public class AudioPlayerAdapter implements AudioPlayer {

    private final AdvancedAudioPlayer advancedAudioPlayer;

    public AudioPlayerAdapter(AdvancedAudioPlayer advancedAudioPlayer) {
        this.advancedAudioPlayer = advancedAudioPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        switch (audioType.toLowerCase()) {
            case "mp4":
                advancedAudioPlayer.playMp4(fileName);
                break;
        }
    }

    @Override
    public void stop() {
        advancedAudioPlayer.stop();
    }
}
