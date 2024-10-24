
public class CondicionAlbum extends Condicion {

	private String albumBuscado;
	@Override
	public boolean cumple(Figurita cc) {
		// TODO Auto-generated method stub
		return cc.getAlbum().equals(albumBuscado);
	}

}
