package bookauthor;

/**
 * Created by user on 20-Sep-15.
 */
public class author {

    private String name;
    private String email;
    public author(String name, String email)
    {this.name = name;
        setEmail(email);}
    public author(String name){this.name = name;}

    void setEmail(String email)
    {this.email = email;}
    String getName()
    {return name;
    }
    String getEmail()
    {return email;}
    void print()
    {
        System.out.println(name+"at"+email);
    }


}
