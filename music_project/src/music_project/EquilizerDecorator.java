package music_project;

public class EquilizerDecorator extends MusicPlayerDecorator {
	public EquilizerDecorator(MusicPlayer decoratedPlayer) {
		super(decoratedPlayer);
	}
	@Override
    public void playMusic() {
        super.playMusic();
        System.out.println("Applying equalizer settings.");
    }
}
