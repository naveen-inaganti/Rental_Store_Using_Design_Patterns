
public class Musiccd extends ListObject{

	private String _name;
	private String _typeId;
	
	public Musiccd(String _name, String _typeId) {
		super();
		this._name = _name;
		this._typeId = _typeId;
	}
	
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public String get_typeId() {
		return _typeId;
	}
	public void set_typeId(String _typeId) {
		this._typeId = _typeId;
	}
	
}
