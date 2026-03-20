package com.inheritance;

public class LibraryManagementSystem {
    String Title;
    int Publication_Year;

    public LibraryManagementSystem(String Title, int Publication_Year)
    {
        this.Title = Title;
        this.Publication_Year = Publication_Year;
    }
    public void DisplayInfo()
    {
        System.out.println("Enter The Title of The Book:-"+Title);
        System.out.println("Enter The Publication Year of The Book:-"+Publication_Year);
    }
}
class Author extends LibraryManagementSystem
{
    String Name;
    String Bio;

    public Author(String Title, int Publication_Year, String Name, String Bio) {
        super(Title, Publication_Year);
        this.Name = Name;
        this.Bio = Bio;
    }

    @Override
    public void DisplayInfo()
    {
        super.DisplayInfo();
        System.out.println("Enter The Name of The Author :-"+Name);
        System.out.println("Enter The Name of The Author :-"+Bio);
    }
}

