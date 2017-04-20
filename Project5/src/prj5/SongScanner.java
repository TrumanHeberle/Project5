package prj5;

public class SongScanner {

    public SongScanner(String filename)
    {
        this.scanSongs(filename);
    }
    
    public DoublyLinkedList<Song> scanSongs(String songFile) {
        DoublyLinkedList<Song> songList = new DoublyLinkedList<Song>();
        try
        {
            Scanner file = new Scanner(new File(songFile));
            int index = 0; 
            file.nextLine();
            while (file.hasNextLine())
            {
                String[] songArray = file.nextLine().split( *, *);
                for (int i = 0; i < songArray.length; i++)
                {
                    songList.add(new Song(songArray[i], songArray[i + 1], 
                        Integer.valueOf(songArray[i + 2]), songArray[i + 3], index));
                    index += 2;
                }
            }
            file.close();
        }
        catch (FileNotFoundException e)
        {
            System.err.println("Caught FileNotFoundException"); 
        }
        return songList;
    }
}
