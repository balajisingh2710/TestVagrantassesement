package assesment;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;




public class RecentlyPlayedStore   {
	private int capacity;
	private Map<String, LinkedList<String>> userSongs;

		
	 public RecentlyPlayedStore(int capacity) {
		        this.capacity = capacity;
		        this.userSongs = new HashMap<>();
		    }

		    public void addSong(String user, String song) {
		        userSongs.putIfAbsent(user, new LinkedList<>());
		        LinkedList<String> songs = userSongs.get(user);

		        if (songs.size() >= capacity) {
		            songs.removeFirst();
		        }

		        songs.addLast(song);
		    }

		    public List<String> getRecentlyPlayedSongs(String user) {
		        return userSongs.getOrDefault(user, new LinkedList<>());
		    }
	}	

	


