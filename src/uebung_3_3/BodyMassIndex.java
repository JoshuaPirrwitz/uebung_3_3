package uebung_3_3;

public class BodyMassIndex {

	public static void main(String[] args) {
		double Gewicht = 75;
		double Koerpergroesse = 1.8;
		double Alter = 22;
		boolean istweiblich=false;
		double BMI = Gewicht/(Koerpergroesse*Koerpergroesse);
		String Beurteilung = "Alles im grünen Bereich"; 
		
		
		
		if (Alter>64 && (istweiblich==true) && BMI<=24) {Beurteilung= "Sie sind untergewichtig";}
		if (Alter>64 && (istweiblich==true) && BMI>=29) {Beurteilung= "Sie sind uebergewichtig";}
		if (Alter>64 && (istweiblich==false) && BMI<=25) {Beurteilung= "Sie sind untergewichtig";}
		if (Alter>64 && (istweiblich==false) && BMI>=30) {Beurteilung= "Sie sind uebergewichtig";}
		
		if (Alter>=55 && Alter<=64 && (istweiblich==true) && BMI<23) {Beurteilung= "Sie sind untergewichtig";}
		if (Alter>=55 && Alter<=64 && (istweiblich==true) && BMI>28) {Beurteilung= "Sie sind uebergewichtig";}
		if (Alter>=55 && Alter<=64 && (istweiblich==false) && BMI<24) {Beurteilung= "Sie sind untergewichtig";}
		if (Alter>=55 && Alter<=64 && (istweiblich==false) && BMI>29) {Beurteilung= "Sie sind uebergewichtig";}
		
		if (Alter>=45 && Alter<=54 && (istweiblich==true) && BMI<22) {Beurteilung= "Sie sind untergewichtig";}
		if (Alter>=45 && Alter<=54 && (istweiblich==true) && BMI>27) {Beurteilung= "Sie sind uebergewichtig";}
		if (Alter>=45 && Alter<=54 && (istweiblich==false) && BMI<23) {Beurteilung= "Sie sind untergewichtig";}
		if (Alter>=45 && Alter<=54 && (istweiblich==false) && BMI>28) {Beurteilung= "Sie sind uebergewichtig";}
		
		if (Alter>=35 && Alter<=44 && (istweiblich==true) && BMI<21) {Beurteilung= "Sie sind untergewichtig";}
		if (Alter>=35 && Alter<=44 && (istweiblich==true) && BMI>26) {Beurteilung= "Sie sind uebergewichtig";}
		if (Alter>=35 && Alter<=44 && (istweiblich==false) && BMI<22) {Beurteilung= "Sie sind untergewichtig";}
		if (Alter>=35 && Alter<=44 && (istweiblich==false) && BMI>27) {Beurteilung= "Sie sind uebergewichtig";}
		
		if (Alter>=25 && Alter<=34 && (istweiblich==true) && BMI<20) {Beurteilung= "Sie sind untergewichtig";}
		if (Alter>=25 && Alter<=34 && (istweiblich==true) && BMI>25) {Beurteilung= "Sie sind uebergewichtig";}
		if (Alter>=25 && Alter<=34 && (istweiblich==false) && BMI<21) {Beurteilung= "Sie sind untergewichtig";}
		if (Alter>=25 && Alter<=34 && (istweiblich==false) && BMI>26) {Beurteilung= "Sie sind uebergewichtig";}
		
		if (Alter<24 && (istweiblich==true) && BMI<24) {Beurteilung= "Sie sind untergewichtig";}
		if (Alter<24 && (istweiblich==true) && BMI>29) {Beurteilung= "Sie sind uebergewichtig";}
		if (Alter<24 && (istweiblich==false) && BMI<20) {Beurteilung= "Sie sind untergewichtig";}
		if (Alter<24 && (istweiblich==false) && BMI>25) {Beurteilung= "Sie sind uebergewichtig";}
		
		System.out.println(BMI);
		System.out.println(Beurteilung);

	}

}
