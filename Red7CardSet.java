import java.util.ArrayList;

public class Red7CardSet{
	private ArrayList<Red7Card> cards;
	
	public Red7CardSet(){
		cards = new ArrayList<Red7Card>();
	}

	public void add(Red7Card rc){
		cards.add(rc);
	}
	
	public int getSize(){
		return cards.size();
	}
	
	public void remove(Red7Card rc){
		cards.remove(rc);
	}
	
	public Red7Card get(int index){ // how do i use this method properly
		return cards.get(index);
	}
	
	public int compareRule(Red7CardSet rs, String color){
		int answer = 0;
		if (color == "red"){
			answer = compareRed(rs);
			// return compareRed(rs);
		}
		else if (color == "orange"){
			answer = compareOrange(rs);
			// return compareOrange(rs);
		}
		else if (color == "yellow"){
			answer = compareYellow(rs);
			// return compareYellow(rs);
		}
		else if (color == "green"){
			answer = compareGreen(rs);
			// return compareGreen(rs);
		}
		else if (color == "blue"){
			answer = compareBlue(rs);
			// return compareBlue(rs);
		}
		else if (color == "indigo"){
			answer = compareIndigo(rs);
			// return compareIndigo(rs);
		}
		else if (color == "violet"){
			answer = compareViolet(rs);
			// return compareViolet(rs);
		}
		
		return answer;
	}
	
	public String toString(){
		// what is my tostring method going to be
		return "hiya";
	}
	
	public int compareRed(Red7CardSet rs){
		int temp = 0;
		for (int i =0;i<cards.size();i++){
			for(int j =0;j<rs.getSize();j++){
				if (cards.get(i).getNumber()-rs.get(j).getNumber()<0){
					temp = cards.get(i).getNumber()-rs.get(j).getNumber();
				}
				else if (cards.get(i).getNumber()-rs.get(j).getNumber()>0){
					temp = cards.get(i).getNumber()-rs.get(j).getNumber();
				}
				else if (cards.get(i).getNumber()-rs.get(j).getNumber()==0){
					for (int k=0;k<7;k++){
						int color = cards.get(0).getColorInd();
						int color2 = rs.get(0).getColorInd();
						while(k<7){
							if (color<cards.get(k).getColorInd()){
								color = cards.get(k).getColorInd();
							}
							if (color2<rs.get(k).getColorInd()){
								color2 = rs.get(k).getColorInd();
							}
						}
						if (color > color2){
							temp = color;
						}
						else{
							temp = color2;
						}
					}
				}
			}
		}
		return temp;
	}
	
	public int compareOrange(Red7CardSet rs){
		int max = 0;
		int sevens = 0;
		int sixes = 0;
		int fives = 0;
		int fours = 0;
		int threes = 0;
		int twos = 0;
		int ones = 0;
		
		int rsh=0;
		int ch=0;
		
		int csevens = 0;
		int csixes = 0;
		int cfives = 0;
		int cfours = 0;
		int cthrees = 0;
		int ctwos = 0;
		int cones = 0;
		
		for (int i=0;i<rs.getSize();i++){
			if(rs.get(i).getNumber()==7){
				sevens++;
			}
			else if(rs.get(i).getNumber()==6){
				sixes++;
			}
			else if(rs.get(i).getNumber()==5){
				fives++;
			}
			else if(rs.get(i).getNumber()==4){
				fours++;
			}
			else if(rs.get(i).getNumber()==3){
				threes++;
			}
			else if(rs.get(i).getNumber()==2){
				twos++;
			}
			else if(rs.get(i).getNumber()==1){
				ones++;
			}
			if (sevens>sixes && sevens>fives && sevens>fours && sevens>threes && sevens>twos && sevens>ones){
				rsh = csevens;
			}
			else if (sixes>sevens && sixes>fives && sixes>fours && sixes>threes && sixes>twos && sixes>ones){
				rsh = sixes;
			}
			else if (fives>sevens && fives>sixes && fives>fours && fives>threes && fives>twos && fives>ones){
				rsh = fives;
			}
			else if (fours>sevens && fours>sixes && fours>fives && fours>threes && fours>twos && fours>ones){
				rsh = fours;
			}
			else if (threes>sevens && threes>sixes && threes>fives && threes>fours && threes>twos && threes>ones){
				rsh = threes;
			}
			else if (twos>sevens && twos>sixes && twos>fives && twos>fours && twos>threes && twos>ones){
				rsh = twos;
			}
			else if (ones>sevens && ones>sixes && ones>fives && ones>fours && ones>threes && ones>twos){
				rsh = ones;
			}
		}
		
		for (int i=0;i<cards.size();i++){
			if(cards.get(i).getNumber()==7){
				csevens++;
			}
			else if(cards.get(i).getNumber()==6){
				csixes++;
			}
			else if(cards.get(i).getNumber()==5){
				cfives++;
			}
			else if(cards.get(i).getNumber()==4){
				cfours++;
			}
			else if(cards.get(i).getNumber()==3){
				cthrees++;
			}
			else if(cards.get(i).getNumber()==2){
				ctwos++;
			}
			else if(cards.get(i).getNumber()==1){
				cones++;
			}
			if (csevens>csixes && csevens>cfives && csevens>cfours && csevens>cthrees && csevens>ctwos && csevens>cones){
				ch = csevens;
			}
			else if (csixes>csevens && csixes>cfives && csixes>cfours && csixes>cthrees && csixes>ctwos && csixes>cones){
				ch = csixes;
			}
			else if (cfives>csevens && cfives>csixes && cfives>cfours && cfives>cthrees && cfives>ctwos && cfives>cones){
				ch = cfives;
			}
			else if (cfours>csevens && cfours>csixes && cfours>cfives && cfours>cthrees && cfours>ctwos && cfours>cones){
				ch = cfours;
			}
			else if (cthrees>csevens && cthrees>csixes && cthrees>cfives && cthrees>cfours && cthrees>ctwos && cthrees>cones){
				ch = cthrees;
			}
			else if (ctwos>csevens && ctwos>csixes && ctwos>cfives && ctwos>cfours && ctwos>cthrees && ctwos>cones){
				ch = ctwos;
			}
			else if (cones>csevens && cones>csixes && cones>cfives && cones>cfours && cones>cthrees && cones>ctwos){
				ch = cones;
			}
		}
		if (rsh-ch>0){
			max = rsh;
		}
		else if(rsh-ch<0){
			max = ch;
		}
		else{
			int rcolor = 0;
			int ccolor = 0;
			int temp = 0;
			int ctemp = 0;
			
			for(int i =0; i<rs.getSize();i++){
				temp = rs.get(0).getColorInd();
				if (temp < rs.get(i).getColorInd()){
					temp = rs.get(i).getColorInd();
				}
			}
			for(int i =0; i<cards.size();i++){
				ctemp = cards.get(0).getColorInd();
				if (ctemp < cards.get(i).getColorInd()){
					ctemp = cards.get(i).getColorInd();
				}
			}
			if (temp-ctemp>0){
				max = temp;
			}
			else if(temp-ctemp<0){
				max = ctemp;
			}
		}
		return max;
	}
	
	public int compareYellow(Red7CardSet rs){
		int numCards = 0;
		int numRedCards = 0;
		int numOrangeCards = 0;
		int numYellowCards = 0;
		int numGreenCards = 0;
		int numBlueCards = 0;
		int numIndigoCards = 0;
		int numVioletCards = 0;
		for (int i=0;i<rs.getSize();i++){
			if(rs.get(i).getColorInd()==7){
				numRedCards++;
			}
			else if(rs.get(i).getColorInd()==6){
				numOrangeCards++;
			}
			else if(rs.get(i).getColorInd()==5){
				numYellowCards++;
			}
			else if(rs.get(i).getColorInd()==4){
				numGreenCards++;
			}
			else if(rs.get(i).getColorInd()==3){
				numBlueCards++;
			}
			else if(rs.get(i).getColorInd()==2){
				numIndigoCards++;
			}
			else if(rs.get(i).getColorInd()==1){
				numVioletCards++;
			}
			if (numRedCards>numOrangeCards && numRedCards>numYellowCards && numRedCards>numGreenCards && numRedCards>numBlueCards && numRedCards>numIndigoCards && numRedCards>numVioletCards){
				numCards = numRedCards;
			}
			else if (numOrangeCards>numRedCards && numOrangeCards>numYellowCards && numOrangeCards>numGreenCards && numOrangeCards>numBlueCards && numOrangeCards>numIndigoCards && numOrangeCards>numVioletCards){
				numCards = numOrangeCards;
			}
			else if (numYellowCards>numRedCards && numYellowCards>numOrangeCards && numYellowCards>numGreenCards && numYellowCards>numBlueCards && numYellowCards>numIndigoCards && numYellowCards>numVioletCards){
				numCards = numYellowCards;
			}
			else if (numGreenCards>numRedCards && numGreenCards>numOrangeCards && numGreenCards>numYellowCards && numGreenCards>numBlueCards && numGreenCards>numIndigoCards && numGreenCards>numVioletCards){
				numCards = numGreenCards;
			}
			else if (numBlueCards>numRedCards && numBlueCards>numOrangeCards && numBlueCards>numYellowCards && numBlueCards>numGreenCards && numBlueCards>numIndigoCards && numBlueCards>numVioletCards){
				numCards = numBlueCards;
			}
			else if (numIndigoCards>numRedCards && numIndigoCards>numOrangeCards && numIndigoCards>numYellowCards && numIndigoCards>numGreenCards && numIndigoCards>numBlueCards && numIndigoCards>numVioletCards){
				numCards = numIndigoCards;
			}
			else if (numVioletCards>numRedCards && numVioletCards>numOrangeCards && numVioletCards>numYellowCards && numVioletCards>numGreenCards && numVioletCards>numBlueCards && numVioletCards>numIndigoCards){
				numCards = numVioletCards;
			}
			else {
				System.out.println("ran out of time so couldn't finish comparing feel free to read comments prof " +numCards);
			}
		}
		return numCards; 
	}
	
	public int compareGreen(Red7CardSet rs){ 
		int numEven = 0;
		for (int i =0;i<rs.getSize();i++){
			if (rs.get(i).getNumber()%2==0){
				numEven++;
			}
		}
		return numEven; // close but ran out of time
	}
	
	public int compareBlue(Red7CardSet rs){
		int numCards = 0;
		int numRedCards = 0;
		int numOrangeCards = 0;
		int numYellowCards = 0;
		int numGreenCards = 0;
		int numBlueCards = 0;
		int numIndigoCards = 0;
		int numVioletCards = 0;	
		if (rs.getSize()>cards.size()){
			numCards = cards.size();
		}
		for (int i=0;i<rs.getSize();i++){
			if(rs.get(i).getColorInd()==7){
				numRedCards++;
			}
			else if(rs.get(i).getColorInd()==6){
				numOrangeCards++;
			}
			else if(rs.get(i).getColorInd()==5){
				numYellowCards++;
			}
			else if(rs.get(i).getColorInd()==4){
				numGreenCards++;
			}
			else if(rs.get(i).getColorInd()==3){
				numBlueCards++;
			}
			else if(rs.get(i).getColorInd()==2){
				numIndigoCards++;
			}
			else if(rs.get(i).getColorInd()==1){
				numVioletCards++;
			}
			numCards = numRedCards+numOrangeCards+numYellowCards+numGreenCards+numBlueCards+numIndigoCards+numVioletCards; // did not finish comparing 
		}
		return numCards;
	} 
	
	public int compareIndigo(Red7CardSet rs){ 
		int max = 0;
		int ch = 0;
		int rsh = 0;
		
		int k = 0;
		while(k<rs.getSize()){
			if (rs.get(0).getNumber()==rs.get(k).getNumber()+1 && rs.get(0).getNumber()==rs.get(k).getNumber()+2 && rs.get(0).getNumber()==rs.get(k).getNumber()+3 && rs.get(0).getNumber()==rs.get(k).getNumber()+ 4 && rs.get(0).getNumber()==rs.get(k).getNumber()+5 && rs.get(0).getNumber()==rs.get(k).getNumber()+6){
				rsh=7;
			}
			else if (rs.get(0).getNumber()==rs.get(k).getNumber()+1 && rs.get(0).getNumber()==rs.get(k).getNumber()+2 && rs.get(0).getNumber()==rs.get(k).getNumber()+3 && rs.get(0).getNumber()==rs.get(k).getNumber()+ 4 && rs.get(0).getNumber()==rs.get(k).getNumber()+5){
				rsh=6;
			}
			else if (rs.get(0).getNumber()==rs.get(k).getNumber()+1 && rs.get(0).getNumber()==rs.get(k).getNumber()+2 && rs.get(0).getNumber()==rs.get(k).getNumber()+3 && rs.get(0).getNumber()==rs.get(k).getNumber()+ 4){
				rsh=5;
			}
			else if (rs.get(0).getNumber()==rs.get(k).getNumber()+1 && rs.get(0).getNumber()==rs.get(k).getNumber()+2 && rs.get(0).getNumber()==rs.get(k).getNumber()+3){
				rsh=4;
			}
			else if (rs.get(0).getNumber()==rs.get(k).getNumber()+1 && rs.get(0).getNumber()==rs.get(k).getNumber()+2){
				rsh=3;
			}
			else if (rs.get(0).getNumber()==rs.get(k).getNumber()+1){
				rsh=2;
			}
			else{
				rsh=1;
			}
			k++;
		}
		
		k=0;
		while(k<cards.size()){
			if (cards.get(0).getNumber()==cards.get(k).getNumber()+1 && cards.get(0).getNumber()==cards.get(k).getNumber()+2 && cards.get(0).getNumber()==cards.get(k).getNumber()+3 && cards.get(0).getNumber()==cards.get(k).getNumber()+ 4 && cards.get(0).getNumber()==cards.get(k).getNumber()+5 && cards.get(0).getNumber()==cards.get(k).getNumber()+6){
				ch=7;
			}
			else if (cards.get(0).getNumber()==cards.get(k).getNumber()+1 && cards.get(0).getNumber()==cards.get(k).getNumber()+2 && cards.get(0).getNumber()==cards.get(k).getNumber()+3 && cards.get(0).getNumber()==cards.get(k).getNumber()+ 4 && cards.get(0).getNumber()==cards.get(k).getNumber()+5){
				ch=6;
			}
			else if (cards.get(0).getNumber()==cards.get(k).getNumber()+1 && cards.get(0).getNumber()==cards.get(k).getNumber()+2 && cards.get(0).getNumber()==cards.get(k).getNumber()+3 && cards.get(0).getNumber()==cards.get(k).getNumber()+ 4){
				ch=5;
			}
			else if (cards.get(0).getNumber()==cards.get(k).getNumber()+1 && cards.get(0).getNumber()==cards.get(k).getNumber()+2 && cards.get(0).getNumber()==cards.get(k).getNumber()+3){
				ch=4;
			}
			else if (cards.get(0).getNumber()==cards.get(k).getNumber()+1 && cards.get(0).getNumber()==cards.get(k).getNumber()+2){
				ch=3;
			}
			else if (cards.get(0).getNumber()==cards.get(k).getNumber()+1){
				ch=2;
			}
			else{
				ch=1;
			}
			k++;
		}
		
		if (rsh-ch>0){
			max = rsh;
		}
		else if (rsh-ch<0){
			max = ch;
		}
		else{
			int rcolor = 0;
			int ccolor = 0;
			int temp = 0;
			int ctemp = 0;
			
			for(int i =0; i<rs.getSize();i++){
				temp = rs.get(0).getColorInd();
				if (temp < rs.get(i).getColorInd()){
					temp = rs.get(i).getColorInd();
				}
			}
			for(int i =0; i<cards.size();i++){
				ctemp = cards.get(0).getColorInd();
				if (ctemp < cards.get(i).getColorInd()){
					ctemp = cards.get(i).getColorInd();
				}
			}
			if (temp-ctemp>0){
				max = temp;
			}
			else if(temp-ctemp<0){
				max = ctemp;
			}
		}
		return max; // did not finish comparing which hand has higher num of cards in a run
	}
	
	public int compareViolet(Red7CardSet rs){ 
		int threes = 0;
		int twos = 0;
		int ones = 0;
		
		int rsh=0;
		int ch=0;
		
		int cones=0;
		int ctwos=0;
		int cthrees=0;
		
		int max=0;
		
		for (int i=0;i<rs.getSize();i++){
			if(rs.get(i).getNumber()==3){
				threes++;
			}
			else if(rs.get(i).getNumber()==2){
				twos++;
			}
			else if(rs.get(i).getNumber()==1){
				ones++;
			}
		}
		for (int k =0;k<cards.size();k++){
			if(cards.get(k).getNumber()==3){
				cthrees++;
			}
			else if(cards.get(k).getNumber()==2){
				ctwos++;
			}
			else if(cards.get(k).getNumber()==1){
				cones++;
			}
		}
		rsh = ones + twos + threes;
		ch = cones + ctwos + cthrees;
		if (rsh-ch>0){
			max = rsh;
		}
		else if(rsh-ch>0){
			max = ch;
		}
		else{
			int rcolor = 0;
			int ccolor = 0;
			int temp = 0;
			int ctemp = 0;
			
			for(int i =0; i<rs.getSize();i++){
				temp = rs.get(0).getColorInd();
				if (temp < rs.get(i).getColorInd()){
					temp = rs.get(i).getColorInd();
				}
			}
			for(int i =0; i<cards.size();i++){
				ctemp = cards.get(0).getColorInd();
				if (ctemp < cards.get(i).getColorInd()){
					ctemp = cards.get(i).getColorInd();
				}
			}
			if (temp-ctemp>0){
				max = temp;
			}
			else if(temp-ctemp<0){
				max = ctemp;
			}
		}
		return max;
	}
}