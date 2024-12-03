/* Title: Final Challenge No. 4: Linked Lists Application
 * Name: Tangonan, Kent Alfred Tarlit
 * Date: December 3, 2024
 * Time: 20:16
 */
import java.util.Scanner;

// Class to represent a Song with title, artist, and links to next and previous songs
class Song {
    String title;
    String artist;
    Song next;
    Song prev;

    // Constructor to initialize song details
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.next = null;
        this.prev = null;
    }

    // Overriding the toString() method to provide a readable representation of a song
    @Override
    public String toString() {
        return title + " by " + artist;
    }
}

// Class to manage a playlist using a doubly circular linked list
class Playlist {
    private Song current; // Pointer to the current song in the playlist
    private int size;     // Number of songs in the playlist

    // Constructor to initialize an empty playlist
    public Playlist() {
        this.current = null;
        this.size = 0;
    }

    // Method to add a song to the playlist
    public void addSong(String title, String artist) {
        Song newSong = new Song(title, artist);
        if (current == null) { // If playlist is empty, initialize with the first song
            current = newSong;
            current.next = current;
            current.prev = current;
        } else { // Add the new song to the end of the playlist
            Song tail = current.prev;
            tail.next = newSong;
            newSong.prev = tail;
            newSong.next = current;
            current.prev = newSong;
        }
        size++; // Increment the playlist size
    }

    // Method to remove a song from the playlist by its title
    public void removeSong(String title) {
        if (current == null) return; // No songs to remove

        Song temp = current;
        do {
            if (temp.title.equals(title)) { // If song is found
                if (temp == current && size == 1) { // If it's the only song, clear the playlist
                    current = null;
                } else { // Update links to remove the song
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                    if (temp == current) {
                        current = temp.next; // Move current to the next song
                    }
                }
                size--; // Decrement the playlist size
                System.out.println("Removed: " + title);
                return;
            }
            temp = temp.next; // Move to the next song
        } while (temp != current);
        System.out.println("Song not found: " + title); // If no match is found
    }

    // Method to move to the next song in the playlist
    public void nextSong() {
        if (current != null) {
            current = current.next;
        }
    }

    // Method to move to the previous song in the playlist
    public void previousSong() {
        if (current != null) {
            current = current.prev;
        }
    }

    // Method to display the currently playing song
    public void displayCurrentSong() {
        if (current != null) {
            System.out.println("Current song: " + current);
        } else {
            System.out.println("No songs in the playlist.");
        }
    }

    // Method to display all songs in the playlist
    public void displayPlaylist() {
        if (current == null) {
            System.out.println("No songs in the playlist.");
            return;
        }
        Song temp = current;
        System.out.println("Playlist:");
        do {
            System.out.println(temp);
            temp = temp.next;
        } while (temp != current);
    }

    // Method to get the size of the playlist
    public int getSize() {
        return size;
    }
}

// Main class to manage user interaction with the playlist
public class MusicPlaylistManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Playlist playlist = new Playlist();
        String command;

        System.out.println("Welcome to the Music Playlist Manager!");
        
        // Main loop to handle user input
        while (true) {
            System.out.println("\nAvailable commands: \nAdd \nRemove \nNext \nPreview \nDisplay \nShow \nExit");
            System.out.print("Enter command: ");
            command = scanner.nextLine().trim().toLowerCase();

            switch (command) {
                case "add":
                    System.out.print("Enter song title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter artist name: ");
                    String artist = scanner.nextLine();
                    playlist.addSong(title, artist); // Add a song to the playlist
                    System.out.println("Added: " + title + " by " + artist);
                    break;

                case "remove":
                    System.out.print("Enter song title to remove: ");
                    String songToRemove = scanner.nextLine();
                    playlist.removeSong(songToRemove); // Remove a song from the playlist
                    break;

                case "next":
                    playlist.nextSong(); // Move to the next song
                    System.out.println("Moved to next song.");
                    break;

                case "prev":
                    playlist.previousSong(); // Move to the previous song
                    System.out.println("Moved to previous song.");
                    break;

                case "display":
                    playlist.displayCurrentSong(); // Display the current song
                    break;

                case "show":
                    playlist.displayPlaylist(); // Display all songs in the playlist
                    break;

                case "exit":
                    System.out.println("Exiting the Music Playlist Manager. Goodbye!");
                    scanner.close(); // Close the scanner
                    return;

                default:
                    System.out.println("Unknown command. Please try again."); // Handle invalid commands
            }
        }
    }
}
