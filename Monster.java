//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//design your Monster class
//write all code for your Monster class here
//test your Monster class with the MonsterRunner\
public class Monster
{
    private String name;
    private int size;
    public Monster()
    {
        name = "";
        size = 0;

    }
    public Monster(String n, int s)
    {
        name = n;
        size = s;

    }
    public boolean isBigger(Monster other)
    {
        if(this.size > other.size)
        {
            return true;
        }
        return false;

    }
    public boolean isSmaller(Monster other)
    {
        if(this.size < other.size)
        {
            return true;
        }
        return false;

    }
    public boolean namesTheSame(Monster other)
    {
        if(this.name.equals(other.name))
        {
            return true;
        }
       
        return false;

    }
}