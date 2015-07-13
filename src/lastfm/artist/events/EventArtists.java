package lastfm.artist.events;

import java.util.List;
import com.google.gson.annotations.Expose;

public class EventArtists {

	@Expose private List<String> artist;
	//@Expose private String[] artist;
	@Expose private String headliner;
	
	public void setArtist(List<String> artist){
		this.artist = artist;
	}
	
	public void setHeadliner(String headliner){
		this.headliner = headliner;
	}
	
	public List<String> getArtist(){
		return artist;
	}
	public String getHeadliner(){
		return headliner;
	}
}
