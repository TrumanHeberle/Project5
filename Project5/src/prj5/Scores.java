//this method would be in the song class and would be used instead of the tracker class

/**
     * returns the number of heard and liked by major
     * @return the int array of heard and liked
     *//**
    public int[] getMajorScore(MajorEnum major, DoublyLinkedList<Person> list)
    {
        double yesHeard = 0;
        double noHeard = 0;
        double yesLiked = 0;
        double noLiked = 0;
        int[] score = new int[2];
        //later add methods here for getting the percentage, which we can use
        //for the visual aspect
        //need to define this personList class
        DoublyLinkedList<Person> majorList = list.getChosenMajorList(major);
        Iterator<Person> iter = majorList.iterator();
        while (iter.hasNext())
        {
            Person person = iter.next();
            if (person.getAnswers()[songNum].equalsIgnoreCase("yes"))
            {
                yesHeard++;
            }
            else if (person.getAnswers()[songNum].equalsIgnoreCase("no"))
            {
                noHeard++;
            }
            if (person.getAnswers()[songNum + 1].equalsIgnoreCase("yes"))
            {
                yesLiked++;
            }
            else if (person.getAnswers()[songNum + 1].equalsIgnoreCase("no"))
            {
                noLiked++;
            }
        }
        //calculate score here
        double totalHeard = yesHeard + noHeard;
        double scoreHeard = yesHeard / totalHeard;
        double totalLiked = yesLiked + noLiked;
        double scoreLiked = yesLiked / totalLiked;
        score[0] = (int)(scoreHeard * 100);
        score[1] = (int)(scoreLiked * 100);
        return score;
    }*/
    
    
    //this method below should be in the DoublyLinkedList class
    
    /**
     * returns a list of a certain major
     * @return a new list
     * @param major the major
     */
    public DoublyLinkedList<Person> getChosenMajorList(MajorEnum major)
    {
        DoublyLinkedList<Person> result = new DoublyLinkedList<Person>();
        @SuppressWarnings("unchecked")
        Iterator<Person> iterator = (Iterator<Person>)this.iterator();
        while (iterator.hasNext())
        {
            Person currentPerson = iterator.next();
            if (currentPerson.getMajor().equals(major))
            {
                result.addToBack(currentPerson);
            }
        }
        return result;
    }
    
    //this is what would be called in the input class to get certain scores
    
    currentSong.getHobbyScore(HobbyEnum.READ, people)[0]);
