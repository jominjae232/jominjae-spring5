public class Fruit {
   String name;
   String color;
   String weight;
   String origin;
   String price;
   public Fruit(String name, String color, String weight, String origin, String price) {
      super();
      this.name = name;
      this.color = color;
      this.weight = weight;
      this.origin = origin;
      this.price = price;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getColor() {
      return color;
   }
   public void setColor(String color) {
      this.color = color;
   }
   public String getWeight() {
      return weight;
   }
   public void setWeight(String weight) {
      this.weight = weight;
   }
   public String getOrigin() {
      return origin;
   }
   public void setOrigin(String origin) {
      this.origin = origin;
   }
   public String getPrice() {
      return price;
   }
   public void setPrice(String price) {
      this.price = price;
   }
   
}