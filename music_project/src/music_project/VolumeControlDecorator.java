package music_project;

public class VolumeControlDecorator extends MusicPlayerDecorator {
	 public VolumeControlDecorator(MusicPlayer decoratedPlayer) {
	        super(decoratedPlayer);
	    }

	    @Override
	    public void playMusic() {
	        super.playMusic();
	        System.out.println("Adjusting volume.");
	    }
	}
