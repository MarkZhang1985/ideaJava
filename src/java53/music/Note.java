package java53.music;

public class Note {

	private int value;
	private Note(int value){
		this.value = value;
	}
	public static final Note MIDDLE_C = new Note( 0 );
	public static final Note C_SHARP  = new Note( 1 );
	public static final Note B_FLAT   = new Note( 2 );

}
