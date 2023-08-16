package assesment;

import java.util.List;

import org.testng.annotations.Test;


public class RecentlyPlayedStoreTest {

	    @Test
	    public void testRecentlyPlayedStore() {
	        RecentlyPlayedStore store = new RecentlyPlayedStore(4);

	        store.addSong("user1", "S1");
	        store.addSong("user1", "S2");
	        store.addSong("user1", "S3");
	        store.addSong("user1", "S4");
	        store.addSong("user1", "S1");
	        store.addSong("user1", "S2");


	        List<String> recentSongs = store.getRecentlyPlayedSongs("user1");
	        System.out.println("Recently played songs for user1: " + recentSongs);
	    }
	}



