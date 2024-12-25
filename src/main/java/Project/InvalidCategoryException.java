package Project;


public class InvalidCategoryException extends Exception {

    public InvalidCategoryException() {

        super("ERROR: Invalid Category");

    }

    public String[] getValidCategories(){
        
        Category category[] = Category.values();
        String[] categories = new String[category.length];
        
        for(int i = 0; i < category.length; i++)
            categories[i] = category[i].name();
        
       return categories;
    }
    
}
