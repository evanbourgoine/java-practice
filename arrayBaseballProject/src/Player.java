public class Player {

    private String fullName;

    public Player(String name) {

        fullName = name;

    }

    public String getName()
    {
        return fullName;
    }

    /**
     * @param name what the name will be set to
     * Sets the name of the player
     */
    public void setName(String name)
    {
        fullName = name;
    }
}