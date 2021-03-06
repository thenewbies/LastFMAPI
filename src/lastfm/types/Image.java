package lastfm.types;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class represents the Image Object to be used in this API as the last.fm
 * JSON deserialized object for image properties
 * @author gaurav
 *
 */
public class Image {

	@JsonProperty("#text")
	private String url;
	private String size;
	
	public void setUrl(String url){
		this.url = url;
	}
	public void setSize(String size){
		this.size = size;
	}
	/**
	 * get the url for the image
	 * @return url as String
	 */
	public String getUrl(){
		return url;
	}
	/**
	 * get the size property. The possible properties as small, large,
	 * extralarge, mega etc.
	 * @return size property as String
	 */
	public String getSize(){
		return size;
	}
}
