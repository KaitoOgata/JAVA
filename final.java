//*******************************************************************
//By: Kaito Ogata
//Date March 23 2020
//*******************************************************************
public class final {
	//variables
  private String _title;
	private String _functionality;
	private Number _daysLate;
	private Number _fines;
	//constructor
	public final (String title,String functionality, Number daysLate, Number fines ) {
		_title = title;
		_functionality = functionality;
		_daysLate = daysLate;
		_fines = fines;
	}
	//getters
	public String getTitle() { return _title; }
	public String getFunctionality() { return _functionality; }
	public Number getdaysLate() { return _daysLate; }
	public Number getfines() { return _fines; }
	//setters
	public void setTitle(String title) {_title = title;}
	public void setFunctionality(String functionality) {_functionality = functionality;}
	public void setdaysLate(Number daysLate) {_daysLate = daysLate;}
	public void setfines(Number fines) {_fines = fines;}
	
	public String toString()
	{
		return "Title: " + _title + "\n" + "Functionality: " + _functionality + "\n" + "daysLate:" + _daysLate +
				"Fines:" + _fines + "\n\n";
	}
}
