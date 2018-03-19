import java.util.Scanner;

public class Main {

    public static int callNumber; //Számolja, hogy milyen 'mélyen' járunk a függvényhívásokban.
    //Minden hívás elõtt növelni kell, ha közvetlen utána pedig csökkenteni.

    public static void main(String[] args) {

        while(true) {

        //Változók inicializálása.
       callNumber = 0;
      Field f1 = new Field();
      Field f2 = new Field();
      Field f3 = new Field();
      Field f4 = new Field();
      Crate c1 = new Crate();
      Crate c2 = new Crate();
      Worker w = new Worker();
      Worker w2 = new Worker();
      Pallet p = new Pallet();
      SwitchableHole sh = new SwitchableHole();
      Switch s = new Switch();
      Hole h = new Hole();
      NotSteppable ns = new NotSteppable();
      
        //Use-case választás.
        //szöveg
        System.out.println("1 - Láda lyukba esik\n2 - Láda ládát tol\n3 - Láda embert tol(nem hal meg)\n"
        		+ "4 - Láda embert tol(meghal)\n5 - Láda embert tol raklapra(meghal)\n6- Kapcsolható lyuk deaktiválása\n"
        		+ "7 - Kapcsoló aktiválás\n8 - Kapcsolható lyukon állás közbeni halál(Worker)\n"
        		+ "9 - Kapcsoló lyukon állás közbeni halál(Crate)\n10 - Ládatolás(mehet)\n11 - Dolgozó lyukba mozog(meghal)\n"
        		+ "12 - Dolgozo mozog(sikeres)\n13 - Dolgozó mozog(fal,nem sikerül)\n14 - Dolgozó mozog(dolgozó->dolgozó,sikertelen)\n"
        		+ "15 - Dolgozó ládát mozgat(Sikeres)\n16 - Dolgozó ládát mozgat(Sikertelen)\n"
        		+ "Adja meg a válaszott Use-case számát");
        //beolvasás
        Scanner reader = new Scanner(System.in);
        int input = reader.nextInt();
        //{Kiírod, hogy mik a lehetõségek, a számuk, és beolvasod a választást. Minden use-case egy case a switchben.
        // Kell még egy eset, hogy ha nem megfelelõ a bemenet.}
        //SWITCH-CASE-el megvalósított use-case választás.
        //KIEGÉSZÍTVE A LEGUTOLSÓ BEADOTT DOKSINKBAN, HOGY AZ ADOTT SZEKVENCIÁK HOL VANNAK
        switch(input) {
        //11. oldal
        case 1:
        	//Láda lyukba esik
        	
        	
        	callNumber++;
            h.wantsToMoveHere(Direction.left, c1);
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            c1.die();
            callNumber--;
            callNumber--;
        	break;
        
        case 2:
        	//Láda ládát tol
        	callNumber++;
            f4.wantsToMoveHere(Direction.right, c1);
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f3.isOccupied();
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f3.getMovable();
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f3.someoneMovesHere(Direction.right, c1, c2);
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f3.getNeighbor(Direction.right);
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f4.wantsToMoveHere(Direction.right, c2);
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f4.isOccupied();
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            c2.setField(f4);
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f4.setMovable(c2);
            callNumber--;
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f3.setMovable(c1);
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            c1.setField(f3);
            callNumber--;
            callNumber--;
            callNumber--;
            break;
            
        	
        case 3:
        	// Láda embert tol(nem hal meg)
        	callNumber++;
        	f1.wantsToMoveHere(Direction.left, c2);
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f2.wantsToMoveHere(Direction.left, c1);
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f2.isOccupied();
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f2.getMovable();
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f2.getNeighbor(Direction.left);
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f3.wantsToMoveHere(Direction.left, w);
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f3.isOccupied();
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            w.setField(f3);
            callNumber--;
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f2.setMovable(c1);
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            c1.setField(f2);
            callNumber--;
            callNumber--;
            callNumber--;
            break;
        	
        	
        	
        case 4:
        	// Láda embert tol(meghal)
        	callNumber++;
        	f1.wantsToMoveHere(Direction.left, c2);
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f2.wantsToMoveHere(Direction.left, c1);
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f2.isOccupied();
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f2.getMovable();
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f2.someoneMovesHere(Direction.left, c1, w);
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            w.setBeingPushed(true);
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f2.getNeighbor(Direction.left);
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f3.wantsToMoveHere(Direction.left, w);
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f3.isOccupied();
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f3.getMovable();
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f3.someoneMovesHere(Direction.left, w, c2);
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            w.isBeingPushed();
            callNumber--;
            callNumber--;
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            w.die();
            callNumber--;
            callNumber--;
            callNumber--;
            callNumber--;
            
        	break;
        case 5:
        	//Láda embert tol raklapra(meghal)
        	callNumber++;
        	f1.wantsToMoveHere(Direction.left, c2);
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f2.wantsToMoveHere(Direction.left, c1);
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f2.isOccupied();
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f2.getMovable();
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f2.someoneMovesHere(Direction.left, c1, w);
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            w.setBeingPushed(true);
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f2.getNeighbor(Direction.left);
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            p.wantsToMoveHere(Direction.left, w);
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            p.isOccupied();
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            p.getMovable();
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            p.someoneMovesHere(Direction.left, w, c2);
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            w.isBeingPushed();
            callNumber--;
            callNumber--;
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            w.die();
            callNumber--;
            callNumber--;
            callNumber--;
            callNumber--;
        	break;
        	
        case 6:
        
        	//Kapcsolható lyuk deaktiválása
            callNumber++;
            w.move(Direction.right);
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            w.getField();
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f1.wantsToMoveFrom(Direction.right);
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f1.getNeighbor(Direction.right);
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            s.wantsToMoveHere(Direction.right, w);
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            s.isOccupied();
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            s.getMovable();
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
        	s.someoneMovesHere(Direction.right, w, c1);
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            s.getNeighbor(Direction.right);
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            f3.wantsToMoveHere(Direction.right, c1);
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            sh.deactivate();
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            s.setMovable(w);
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            w.setField(s);
            callNumber--;
            callNumber--;
            callNumber--;
            callNumber--;
            break;
            
            
        case 7:
        	//Kapcsoló aktiválás
            callNumber++;
            s.wantsToMoveHere(Direction.left, c1); 
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            s.isOccupied();
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            s.setMovable(c1);
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            c1.setField(s);
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            s.getSwitchable();
            callNumber--;
            for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
            callNumber++;
            sh.activate();
            callNumber--;
            callNumber--;	
        	
            break;
        case 8:
        	//Kapcsolható lyukon állás közbeni halál(Worker)
        	callNumber++;
        	sh.activate();
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	sh.isOccupied();
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	w.die();
        	callNumber--;
            callNumber--;
        	
            break;
        case 9:
        	//Kapcsolható lyukon állás közbeni halál(Crate)
        	callNumber++;
        	sh.activate();
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	sh.isOccupied();
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	c1.die();
        	callNumber--;
            callNumber--;
            break;
        case 10:
        	//ládatolás(mehet)
        	callNumber++;
        	f3.wantsToMoveHere(Direction.right, c1);
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f3.isOccupied();
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f3.setMovable(c1);
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	c1.setField(f3);
        	callNumber--;
        	callNumber--;
        	break;
        	
        	
        case 11:
        	//Dolgozó lyukba mozog(meghal)
        	
        	callNumber++;
        	w.move(Direction.down);
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	w.getField();
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f1.wantsToMoveFrom(Direction.down);
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f1.getNeighbor(Direction.down);
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	h.wantsToMoveHere(Direction.down, w);
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	w.die();
        	callNumber--;
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f1.setMovable(null);
        	callNumber--;
        	callNumber--;
        	callNumber--;
        	break;
        	
        	
        case 12:
        	//Dolgozo mozog(sikeres)
        	
        	callNumber++;
        	w.move(Direction.right);
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	w.getField();
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f1.wantsToMoveFrom(Direction.right);
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f1.getNeighbor(Direction.right);
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f2.wantsToMoveHere(Direction.right, w);
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f2.isOccupied();
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f2.setMovable(w);
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	w.setField(f2);
        	callNumber--;
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f1.setMovable(null);
        	callNumber--;
        	callNumber--;
        	callNumber--;
        	break;
        	
        case 13:
        	//Dolgozó mozog(fal,nem sikerül)
        	callNumber++;
        	w.move(Direction.right);
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	w.getField();
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f1.wantsToMoveFrom(Direction.right);
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f1.getNeighbor(Direction.right);
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	ns.wantsToMoveHere(Direction.right, w);
        	callNumber--;
        	callNumber--;
        	callNumber--;
        	break;
        
        case 14:
        	//Dolgozó mozog(dolgozó->dolgozó,sikertelen)
        	callNumber++;
        	w.move(Direction.up);
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	w.getField();
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f1.wantsToMoveFrom(Direction.up);
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f1.getNeighbor(Direction.up);
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f2.wantsToMoveHere(Direction.up, w);
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f2.isOccupied();
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f2.getMovable();
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f2.someoneMovesHere(Direction.up, w, w2);
        	callNumber--;
        	callNumber--;
        	callNumber--;
        	callNumber--;
        	break;
        	
        case 15:
        	//Dolgozó ládát mozgat(Sikertelen)
        	callNumber++;
        	w.move(Direction.down);
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	w.getField();
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f1.wantsToMoveFrom(Direction.down);
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f1.getNeighbor(Direction.down);
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f2.wantsToMoveHere(Direction.down, w);
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f2.isOccupied();
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f2.getMovable();
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f2.someoneMovesHere(Direction.down, w, c1);
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	w.isBeingPushed();
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f2.getNeighbor(Direction.down);
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f3.wantsToMoveHere(Direction.down, c1);
        	callNumber--;
        	callNumber--;
        	callNumber--;
        	callNumber--;
        	break;
        	
        case 16:
        	//Dolgozó ládát mozgat(Sikeres)
        	callNumber++;
        	w.move(Direction.up);
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	w.getField();
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f1.wantsToMoveFrom(Direction.up);
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f1.getNeighbor(Direction.up);
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f2.wantsToMoveHere(Direction.up, w);
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f2.isOccupied();
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f2.getMovable();
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f2.someoneMovesHere(Direction.up, w, c1);
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f2.getNeighbor(Direction.up);
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f3.wantsToMoveHere(Direction.up, c1);
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f2.setMovable(w);
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	w.setField(f2);
        	callNumber--;
        	callNumber--;
        	callNumber--;
        	for (int i = 0; i < Main.callNumber; i++) System.out.print("---");
        	callNumber++;
        	f1.setMovable(null);
        	callNumber--;
        	callNumber--;
        	callNumber--;
        	
        	break;
        	
        default:
        	System.out.println("Érvénytelen szám");
        //A use-case-hez szükséges változók inicialízálása
    //    Write w = new Write();

        //Maga a use-case
        /*
        for(int i = 0; i < Main.callNumber; i++) System.out.print("---");
        System.out.print("Object of class: ");
        Main.callNumber++;
        w.foo();
        Main.callNumber--;

        Main.callNumber++;
        w.foo();
        Main.callNumber--;
         */
        //}
        }
        }
    }
}