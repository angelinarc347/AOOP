package music_project;

public class OnlineStreamingServiceAdapter implements MusicSource {
	private String serviceUrl;

    public OnlineStreamingServiceAdapter(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    @Override
    public void play() {
        System.out.println("Streaming music from: " + serviceUrl);
    }
}
