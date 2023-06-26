package day17CollectionArrayList;
import java.util.*;

public class UsePen {
	public static void main(String[] args) {
		Pen p1=new Pen();
		p1.brand="cello";
		p1.color="blue";
		p1.price=20;
		
		Pen p2=new Pen();
		p2.brand="camlin";
		p2.color="red";
		p2.price=35;
		
		Pen p3=new Pen();
		p3.brand="natraj";
		p3.color="green";
		p3.price=42;
		
		Pen p4=new Pen();
		p4.brand="doms";
		p4.color="pink";
		p4.price=55;
		
		ArrayList<Pen> pens=new ArrayList<>();
		pens.add(p1);
		pens.add(p2);
		pens.add(p3);
		pens.add(p4);
		System.out.println(pens);
//		System.out.println(pens.set(1, p4));
//		System.out.println(pens);
		
		for(Pen p:pens) {
			if(p.price%2==0) {
			System.out.println(p.price);
		}
		}
//			if(p.brand.startsWith("c")) {
//				System.out.println(p.brand);
//			}
			ArrayList<Pen> bluePens=new ArrayList<>();
			for(Pen p:pens) {
			if(p.color.equals("blue")) {
				bluePens.add(p);
				System.out.println(bluePens);
			}
		}
//		for(int i=0 ; i<pens.size() ; i++) {
//			System.out.println(pens.get(i));
//		}
//		pens.forEach(p->System.out.println(p));
		
	}
}
