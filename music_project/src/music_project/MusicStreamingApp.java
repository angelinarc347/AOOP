package music_project;

public class MusicStreamingApp {

	public static void main(String[] args) {
		MusicSource localFile = new LocalFileAdapter("/path/to/local/song.mp3");
        MusicPlayer basicPlayer = new BasicMusicPlayer(localFile);

        System.out.println("--- Basic Music Player ---");
        basicPlayer.playMusic();

        System.out.println("\n--- Music Player Volume Control ---");
        MusicPlayer advancedPlayer = new VolumeControlDecorator(basicPlayer);
        advancedPlayer.playMusic();
        
        System.out.println("\n--- Music Player with Equalizer ---");
        MusicPlayer equalizerPlayer = new EquilizerDecorator(basicPlayer);
        equalizerPlayer.playMusic();

        // Using an online streaming service
        MusicSource streamingService = new OnlineStreamingServiceAdapter("https://streaming.service.url");
        MusicPlayer streamingPlayer = new BasicMusicPlayer(streamingService);
        System.out.println("\n--- Streaming Service Player ---");
        streamingPlayer.playMusic();

        // Using a radio station
        MusicSource radioStation = new RadioStationAdapter("https://radio.station.url");
        MusicPlayer radioPlayer = new VolumeControlDecorator(new BasicMusicPlayer(radioStation));
        System.out.println("\n--- Radio Player with Volume Control ---");
        radioPlayer.playMusic();
    }
}

