
public class Board {
	Cell[][] grid;
	private int size;
	public Board(int size) {
		this.size = size;
		this.grid = new Cell[size][size];
	}
	public Board createBoard() {
		for (int i=0;i<this.size;i++) {
			for (int j=0; j<this.size;j++) {
				this.grid[i][j] = new Cell(false);
			}
		}
		return this;
	}
	public String printBoard () {
		String con ="";
		for (int i=0 ; i<this.size;i++) {
			for (int j=0;j<this.size;j++) {
				if(this.grid[i][j].check==true) {
					con +="*";
					if(j==this.size -1 && i<this.size -1) {
						con = con +"\n";
					}
					
				}else {
					con +=".";
					if(j==this.size-1 && i<this.size -1) {
						con =con+"\n";
					}
				}
			}
		}
		return con;
	}
	public Board generateNextGeneration(Board gen) {
        for(int i=1;i<this.size-1;i++){
            for(int j=1;j<this.size-1;j++){
                int count=0;
                if(this.grid[i-1][j-1].check){
                    count+=1;
                }
                if(this.grid[i-1][j].check){
                    count+=1;
                }
                if(this.grid[i-1][j+1].check){
                    count+=1;
                }
                if(this.grid[i][j-1].check){
                    count+=1;
                }
                if(this.grid[i][j+1].check){
                    count+=1;
                }
                if(this.grid[i+1][j-1].check){
                    count+=1;
                }
                if(this.grid[i+1][j].check){
                    count+=1;
                }
                if(this.grid[i+1][j+1].check){
                    count+=1;
                }
                if(this.grid[i][j].check){
                    if(count==2 || count==3){
                        gen.grid[i][j].check=true;
                        
                    }
                }
                else{
                    if(count==3){
                        gen.grid[i][j].check=true;
                    }
                }
            }
            

        }
//        System.out.println();
//        System.out.println("NextGenration");
//        printBoard(g);
        return gen;
    }
}
