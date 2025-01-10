package music_project;

public abstract class MusicPlayerDecorator extends MusicPlayer {
	protected MusicPlayer decoratedPlayer;

    public MusicPlayerDecorator(MusicPlayer decoratedPlayer) {
        super(decoratedPlayer.musicSource);
        this.decoratedPlayer = decoratedPlayer;
    }

    @Override
    public void playMusic() {
        decoratedPlayer.playMusic();
    }
}
