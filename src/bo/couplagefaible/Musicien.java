package bo.couplagefaible;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="mus")
public class Musicien {
	public String morceau;
	
	@Autowired
	@Qualifier("piano")
	public Instrument instrument;
	
	public Musicien() {
		this.morceau = "La lettre a Elise";
	}
	
	public Musicien(String morceau, Instrument instrument) {
		super();
		this.morceau = morceau;
		this.instrument = instrument;
	}
	
	public void jouer() {
		instrument.afficher();
		System.out.print(" et je joue le morceau : " + morceau);
		instrument.jouer();
	}

	public String getMorceau() {
		return morceau;
	}

	public void setMorceau(String morceau) {
		this.morceau = morceau;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
}
