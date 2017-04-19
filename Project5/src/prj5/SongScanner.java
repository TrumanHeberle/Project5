package prj5;

public class SongScanner {

    public DoublyLinkedList<Song> scanSongs(String songFile) {
        DoublyLinkedList<Song> = new DoublyLinkedList<Song>();
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
        }
        catch (FileNotFoundException e)
        {
            //not sure what to do with this exception   
        }
        return songList;
    }

    //don't think we need these methods below but i'm not sure
    public SONGLIST getSongList() {
        // TODO Auto-generated method stub
        return null;
    }
    
    public void sortByTitle() {
        // TODO
    }
}
