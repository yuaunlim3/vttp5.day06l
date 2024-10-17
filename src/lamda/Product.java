package lamda;

public class Product {
    private long id;
    private String name; 
    private String description; 
    private String category;

    public Product(long id, String name, String description, String category){
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", description=" + description + ", category=" + category + "]";
    }
    


}