package recognition;

public class Driver {
	public static void main(String[] args) {
		Figure[] objArr = {new HatMaker(),
							new HatMaker(),
							new VeeMaker(),
							new ParallelMaker(),
							new FaceMaker()};		
		
//		System.out.print(Arrays.toString(objArr));
		new Driver(objArr);
		
	}
	
	public Driver(Figure[] figures){
		final String SPACE = " ";
		for(Figure o : figures){
			System.out.print(o.getFigure()+SPACE);
		}
		}
	/*
	public Driver(Object[] figures){
		final String SPACE = " ";
		for(Object o : figures){
			if(o instanceof HatMaker) {
				HatMaker h = (HatMaker)o;
				System.out.print(h.getFigure()+SPACE);
			}
			if(o instanceof VeeMaker) {
				VeeMaker v = (VeeMaker)o;
				System.out.print(v.getFigure()+ SPACE);
			}
			if(o instanceof ParallelMaker) {
				ParallelMaker p = (ParallelMaker)o;
				System.out.print(p.getFigure()+ SPACE);
			}
		}
	}
*/
}
