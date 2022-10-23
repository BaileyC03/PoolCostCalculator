import java.util.Scanner;

public class PoolCost{ 
	
	static final int COST_OF_EXC = 20;
	static final int COST_OF_TILING = 25;
	static final int MACHINERY_COST = 1000;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// Accepts Inputs For The Dimensions2
		System.out.print("Please input the length of the pool: ");
		int length = in.nextInt();
		System.out.print("Please input the width of the pool: ");
		int width = in.nextInt();
		System.out.print("Please input the depth of the pool: ");
		int depth = in.nextInt();
		
		// Volume Calculations For The Excavation
		int volume = depth*width*length;
		System.out.println("Depth: " + depth
				+ " Width: " + width + " Length: " + length);
		
		// Area Calculations  For Tiling
		int baseArea = width * length;
		int endArea = width*depth*2; // 2 ends of the pool
		int sideArea = length*depth*2; // 2 sides to the pool
		
		// Cost Calculations
		int excCost = volume*COST_OF_EXC;
		int tilingCost = ((baseArea+endArea+sideArea)*COST_OF_TILING);
		System.out.println("Excavation cost: " + excCost);
		System.out.println("Tiling cost: " + tilingCost);
		System.out.println("Total cost: " + (MACHINERY_COST+excCost+tilingCost));
		
	}
}