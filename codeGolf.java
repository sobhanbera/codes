public class codeGolf{
	public static void main(String[]a){
		String f="On the {} day of Christmas\nMy true love sent to me\n";
		String m[]={"Twelve Drummers Drumming,\n",
					"Eleven Pipers Piping,\n",
					"Ten Lords-a-Leaping,\n",
					"Nine Ladies Dancing,\n",
					"Eight Maids-a-Milking,\n",
					"Seven Swans-a-Swimming,\n",
					"Six Geese-a-Laying,\n",
					"Five Gold Rings,\n",
					"Four Calling Birds,\n",
					"Three French Hens,\n",
					"Two Turtle Doves, and\n"};
		String l="A Partridge in a Pear Tree.";
		String d[]={"First","Second","Third","Fourth","Fifth","Sixth","Seventh","Eighth","Nineth","Tenth","Eleventh","Twelfth"};
		int v=0;
		for(int i=0;i<12;++i){
			String s=f.replace("{}",d[i]);
			for(int j=0;j<i;++j){
				s+=m[v];
				++v;
			}
			v=0;
			System.out.println(s+"\n");
			s = "";
		}
	}
}