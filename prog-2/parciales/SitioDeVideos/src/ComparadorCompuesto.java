import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Video> {

	Comparator<Video> c1;
	Comparator<Video> c2;
	
	
	
	public ComparadorCompuesto(Comparator<Video> c1, Comparator<Video> c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}



	@Override
	public int compare(Video o1, Video o2) {
		int result = c1.compare(o1, o2);
		if (result==0) {
			return c2.compare(o1,o2);
		}
		return result;
	}

}
