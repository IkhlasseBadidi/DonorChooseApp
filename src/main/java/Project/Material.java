package Project;

public class Material {

    private String name;
    private String description;
    private double unit_price;
    private int qty_needed;

    public Material(String name, String description, double unit_price, int qty_needed) {
        this.name = name;
        this.description = description;
        this.unit_price = unit_price;
        this.qty_needed = qty_needed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }

    public int getQty_needed() {
        return qty_needed;
    }

    public void setQty_needed(int qty_needed) {
        this.qty_needed = qty_needed;
    }

    @Override
    public String toString() {
        return "Material{" + "name=" + name + ", description=" + description + ", unit_price=" + unit_price + ", qty_needed=" + qty_needed + '}';
    }

}
