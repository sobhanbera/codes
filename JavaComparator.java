package hackerrank;

import java.util.*;

class Stud implements Comparable{
    private int id;
    private String fname;
    private double cgpa;
    public Stud(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
    public int compareTo(Object o){
        Stud s=(Stud)o;
        if(cgpa==s.cgpa){
            if(fname.equals(s.fname)){
                return id-s.id;
            }else{
                return fname.compareTo(s.fname);
            }
        }else{
            if(s.cgpa-cgpa>0)
                return 1;
            else 
                return -1;
        }
    }
}

public class JavaComparator{
    
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
      
        List<Stud> studList = new ArrayList<Stud>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();
         
            Stud st = new Stud(id, fname, cgpa);
            studList.add(st);
         
            testCases--;
        }
       
        Collections.sort(studList);
        for(Stud st: studList){
        	System.out.println(st.getFname());
        }
   }
}
