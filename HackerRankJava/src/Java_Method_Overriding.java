
public class Java_Method_Overriding {

	public static class Sports{

	    String getName(){
	        return "Generic Sports";
	    }
	  
	    void getNumberOfTeamMembers(){
	        System.out.println( "Each team has n players in " + getName() );
	    }
	}

	public static class Soccer extends Sports{
	    @Override
	    String getName(){
	        return "Soccer Class";
	    }

	    // Write void 
	    void getNumberOfTeamMembers(){
	        System.out.println( "Each team has 11 players in " + getName() );
	    }
	}
	    
	    public static void main(String []args){
	        Sports c1 = new Sports();
	        Soccer c2 = new Soccer();
	        System.out.println(c1.getName());
	        c1.getNumberOfTeamMembers();
	        System.out.println(c2.getName());
	        c2.getNumberOfTeamMembers();
		}
}
	
