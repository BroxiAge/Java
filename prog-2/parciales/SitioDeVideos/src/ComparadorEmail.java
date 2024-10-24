import java.util.Comparator;

public class ComparadorEmail implements Comparator<Video> {

	@Override
	public int compare(Video o1, Video o2) {
		// TODO Auto-generated method stub
		return o1.getAutor().getEmail().compareTo(
				o2.getAutor().getEmail());
	}

}
