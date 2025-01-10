package music_project;

public abstract class MusicPlayer {
	protected MusicSource musicSource;

    public MusicPlayer(MusicSource musicSource) {
        this.musicSource = musicSource;
    }

    public abstract void playMusic();
}

class BasicMusicPlayer extends MusicPlayer {
    public BasicMusicPlayer(MusicSource musicSource) {
        super(musicSource);
        this.musicSource = musicSource;
    }

    @Override
    public void playMusic() {
        if (musicSource == null) {
            System.out.println("No music source is set.");
            return;
        }
        System.out.println("Basic music player in use.");
        musicSource.play();
    }
}
