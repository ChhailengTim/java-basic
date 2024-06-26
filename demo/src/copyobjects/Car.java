package copyobjects;

public class Car {
	private String name;
	  private String model;
	  private int year;
	  
	  Car(String name, String model, int year){
	    this.name=name;
	    this.model=model;
	    this.year=year;
	  }
	  
	  Car(Car x){
	    this.copy(x);
	  }
	  
	  public String getName() {
	    return name;
	  }
	  
	  public String getModel() {
	    return model;
	  }
	  
	  public int getYear() {
	    return year;
	  }
	  public void setName(String name) {
	    this.name = name;
	  }
	  
	  public void setModel(String model) {
	    this.model = model;
	  }
	  
	  public void setYear(int year) {
	    this.year = year;
	  }
	  
	  public void copy(Car x) {
	    this.setName(x.getName());
	    this.setModel(x.getModel());
	    this.setYear(x.getYear());
	  }


}
