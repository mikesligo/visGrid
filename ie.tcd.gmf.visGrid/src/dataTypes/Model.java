package dataTypes;

public class Model {
	private String name;
	private String type;
	private String parent_name;
	private Model parent;

	public Model(String name, String type, String parent_name){
		this.name = name;
		this.type = type;
		this.setParent_name(parent_name);
	}
	
	public Model(String name, String type, Model parent){
		this.name = name;
		this.type = type;
		this.parent = parent;
		this.setParent_name(this.parent.getName());
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Model getParent() {
		return parent;
	}
	public void setParent(Model parent) {
		this.parent = parent;
	}

	public String getParent_name() {
		return parent_name;
	}

	public void setParent_name(String parent_name) {
		this.parent_name = parent_name;
	}


}